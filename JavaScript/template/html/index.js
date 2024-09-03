document.addEventListener('DOMContentLoaded', () => {
    const inputField = document.getElementById('input-form');
    const resetButton = document.getElementById('resetButton');

    function handleInput(event) {
        const inputValue = event.target.value;
        if (inputValue) {
            resetButton.style.display = 'flex';
        } else {
            resetButton.style.display = 'none';
        }
    }

    function resetInput() {
        inputField.value = '';
        resetButton.style.display = 'none';
        inputField.focus();
    }

    // Gắn sự kiện
    inputField.addEventListener('input', handleInput);
    resetButton.addEventListener('click', resetInput);
    document.getElementById('form-input').addEventListener('submit', onSubmit);
});

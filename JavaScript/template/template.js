const inputField = document.getElementById('input-form');
const output = document.getElementById('output');

function onSubmit(event) {
    event.preventDefault();
    // Code start here
    var input = inputField.value;
    if (input % 2 === 0 && input >= 4) {
        output.textContent = "YES";
    }
    else {
        output.textContent = "NO";
    }
}
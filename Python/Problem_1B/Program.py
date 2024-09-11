from sys import stdin
input = stdin.readline

for _ in range(int(input())):
    cell = input().strip()
    if cell[0] == "R" and cell[1].isdigit() and "C" in cell:
        row, col = cell[1:].split("C")
        col = int(col)
        column = []
        while col > 0:
            col -= 1
            column.append(chr(col % 26 + 65))
            col //= 26
        print(''.join(reversed(column)) + row)
    else:
        col = 0
        j = 0
        while j < len(cell) and cell[j].isalpha():
            col = col * 26 + (ord(cell[j]) - ord('A') + 1)
            j += 1
        row = cell[j:]
        print(f"R{row}C{col}")

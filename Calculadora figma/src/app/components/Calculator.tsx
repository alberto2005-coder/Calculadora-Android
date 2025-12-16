import { useState } from 'react';

export function Calculator() {
  const [display, setDisplay] = useState('0');
  const [previousValue, setPreviousValue] = useState<number | null>(null);
  const [operation, setOperation] = useState<string | null>(null);
  const [waitingForOperand, setWaitingForOperand] = useState(false);
  const [memory, setMemory] = useState(0);

  const inputDigit = (digit: string) => {
    if (waitingForOperand) {
      setDisplay(digit);
      setWaitingForOperand(false);
    } else {
      setDisplay(display === '0' ? digit : display + digit);
    }
  };

  const inputDecimal = () => {
    if (waitingForOperand) {
      setDisplay('0.');
      setWaitingForOperand(false);
    } else if (display.indexOf('.') === -1) {
      setDisplay(display + '.');
    }
  };

  const clear = () => {
    setDisplay('0');
  };

  const allClear = () => {
    setDisplay('0');
    setPreviousValue(null);
    setOperation(null);
    setWaitingForOperand(false);
  };

  const performOperation = (nextOperation: string) => {
    const inputValue = parseFloat(display);

    if (previousValue === null) {
      setPreviousValue(inputValue);
    } else if (operation) {
      const currentValue = previousValue;
      let newValue = currentValue;

      switch (operation) {
        case '+':
          newValue = currentValue + inputValue;
          break;
        case '-':
          newValue = currentValue - inputValue;
          break;
        case '×':
          newValue = currentValue * inputValue;
          break;
        case '÷':
          newValue = currentValue / inputValue;
          break;
        default:
          break;
      }

      setDisplay(String(newValue));
      setPreviousValue(newValue);
    }

    setWaitingForOperand(true);
    setOperation(nextOperation);
  };

  const handleEquals = () => {
    const inputValue = parseFloat(display);

    if (previousValue !== null && operation) {
      let newValue = previousValue;

      switch (operation) {
        case '+':
          newValue = previousValue + inputValue;
          break;
        case '-':
          newValue = previousValue - inputValue;
          break;
        case '×':
          newValue = previousValue * inputValue;
          break;
        case '÷':
          newValue = previousValue / inputValue;
          break;
        default:
          break;
      }

      setDisplay(String(newValue));
      setPreviousValue(null);
      setOperation(null);
      setWaitingForOperand(true);
    }
  };

  const handlePercent = () => {
    const value = parseFloat(display);
    setDisplay(String(value / 100));
  };

  const handleSquareRoot = () => {
    const value = parseFloat(display);
    setDisplay(String(Math.sqrt(value)));
  };

  const handleSquare = () => {
    const value = parseFloat(display);
    setDisplay(String(value * value));
  };

  const handleMemoryAdd = () => {
    setMemory(memory + parseFloat(display));
  };

  const handleMemorySubtract = () => {
    setMemory(memory - parseFloat(display));
  };

  return (
    <div className="bg-[#2d2d2d] p-4 rounded-lg shadow-2xl w-[240px]">
      {/* Display */}
      <div className="bg-white rounded-lg mb-4 p-4 h-20 flex items-center justify-end">
        <div className="text-4xl">{display}</div>
      </div>

      {/* Buttons Grid */}
      <div className="grid grid-cols-4 gap-2">
        {/* Row 1: %, √, x², ÷ */}
        <button
          onClick={handlePercent}
          className="bg-[#6b6b6b] hover:bg-[#7b7b7b] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          %
        </button>
        <button
          onClick={handleSquareRoot}
          className="bg-[#6b6b6b] hover:bg-[#7b7b7b] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          √
        </button>
        <button
          onClick={handleSquare}
          className="bg-[#6b6b6b] hover:bg-[#7b7b7b] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          x²
        </button>
        <button
          onClick={() => performOperation('÷')}
          className="bg-[#6b6b6b] hover:bg-[#7b7b7b] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          ÷
        </button>

        {/* Row 2: M+, M-, C, AC */}
        <button
          onClick={handleMemoryAdd}
          className="bg-[#6b6b6b] hover:bg-[#7b7b7b] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          M+
        </button>
        <button
          onClick={handleMemorySubtract}
          className="bg-[#6b6b6b] hover:bg-[#7b7b7b] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          M-
        </button>
        <button
          onClick={clear}
          className="bg-[#6b6b6b] hover:bg-[#7b7b7b] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          C
        </button>
        <button
          onClick={allClear}
          className="bg-[#6b6b6b] hover:bg-[#7b7b7b] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          AC
        </button>

        {/* Row 3: 7, 8, 9, × */}
        <button
          onClick={() => inputDigit('7')}
          className="bg-[#505050] hover:bg-[#606060] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          7
        </button>
        <button
          onClick={() => inputDigit('8')}
          className="bg-[#505050] hover:bg-[#606060] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          8
        </button>
        <button
          onClick={() => inputDigit('9')}
          className="bg-[#505050] hover:bg-[#606060] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          9
        </button>
        <button
          onClick={() => performOperation('×')}
          className="bg-[#7c3aed] hover:bg-[#8b47f5] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          ×
        </button>

        {/* Row 4: 4, 5, 6, - */}
        <button
          onClick={() => inputDigit('4')}
          className="bg-[#505050] hover:bg-[#606060] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          4
        </button>
        <button
          onClick={() => inputDigit('5')}
          className="bg-[#505050] hover:bg-[#606060] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          5
        </button>
        <button
          onClick={() => inputDigit('6')}
          className="bg-[#505050] hover:bg-[#606060] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          6
        </button>
        <button
          onClick={() => performOperation('-')}
          className="bg-[#7c3aed] hover:bg-[#8b47f5] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          -
        </button>

        {/* Row 5: 1, 2, 3, + */}
        <button
          onClick={() => inputDigit('1')}
          className="bg-[#505050] hover:bg-[#606060] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          1
        </button>
        <button
          onClick={() => inputDigit('2')}
          className="bg-[#505050] hover:bg-[#606060] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          2
        </button>
        <button
          onClick={() => inputDigit('3')}
          className="bg-[#505050] hover:bg-[#606060] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          3
        </button>
        <button
          onClick={() => performOperation('+')}
          className="bg-[#7c3aed] hover:bg-[#8b47f5] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          +
        </button>

        {/* Row 6: 0 (double width), ., =, ÷ */}
        <button
          onClick={() => inputDigit('0')}
          className="bg-[#505050] hover:bg-[#606060] text-white rounded-full h-12 flex items-center justify-center col-span-2 transition-colors"
        >
          0
        </button>
        <button
          onClick={inputDecimal}
          className="bg-[#505050] hover:bg-[#606060] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          .
        </button>
        <button
          onClick={handleEquals}
          className="bg-[#06b6d4] hover:bg-[#17c5de] text-white rounded-full h-12 flex items-center justify-center transition-colors"
        >
          =
        </button>
      </div>
    </div>
  );
}

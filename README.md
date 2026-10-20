# Calculadora Android & Figma Design 📱

Este proyecto es una solución integral de calculadora que incluye tanto una implementación nativa en **Android Studio** como un prototipo funcional basado en un diseño de **Figma**.

## 🚀 Descripción General

El repositorio está dividido en dos grandes secciones:
1.  **Calculadora Android Studio**: Una aplicación nativa desarrollada en Java para Android.
2.  **Calculadora Figma**: Una implementación web (React + Vite + Tailwind CSS) que refleja fielmente el diseño y la documentación de Figma.

---

## 📱 Calculadora Android Studio

Esta es la aplicación principal destinada a dispositivos Android. Ofrece una interfaz intuitiva con capacidades de cálculo estándar y avanzadas.

### ✨ Características
*   **Operaciones Básicas**: Suma, resta, multiplicación y división.
*   **Funciones Avanzadas**: Raíz cuadrada, elevado al cuadrado y porcentaje.
*   **Gestión de Memoria**: Funciones `M+` y `M-` para almacenar resultados temporales.
*   **Persistencia de Estado**: Mantiene los cálculos actuales incluso si la aplicación se reinicia o se rota la pantalla.
*   **Interfaz Adaptativa**: Diseñada para ser clara y funcional en diversos tamaños de pantalla.

### 🛠️ Tecnologías Utilizadas
*   **Lenguaje**: Java
*   **Entorno**: Android Studio
*   **Componentes**: AppCompat, Material Design components.

### 🏃 Cómo Ejecutar
1.  Abre la carpeta `Calculadora Android Studio` en **Android Studio**.
2.  Sincroniza el proyecto con los archivos Gradle.
3.  Conecta tu dispositivo Android o inicia un emulador.
4.  Haz clic en **'Run'**.

---

## 🎨 Calculadora Figma (Web Prototype)

Esta sección contiene el "código bastante completo" derivado directamente del diseño de Figma, permitiendo previsualizar la interfaz en un entorno web antes de su despliegue final.

### ✨ Características
*   **Fidelidad de Diseño**: Implementación exacta de los tokens de diseño y componentes definidos en Figma.
*   **Interactividad**: Prototipo funcional que permite realizar cálculos básicos en el navegador.
*   **Documentación de Diseño**: Incluye guías y recursos utilizados durante la fase de diseño.

### 🛠️ Tecnologías Utilizadas
*   **Framework**: React con TypeScript
*   **Bundler**: Vite
*   **Estilos**: Tailwind CSS
*   **Componentes**: Basados en shadcn/ui

### 🏃 Cómo Ejecutar
1.  Navega a la carpeta `Calculadora figma`.
2.  Instala las dependencias:
    ```bash
    npm install
    ```
3.  Inicia el servidor de desarrollo:
    ```bash
    npm run dev
    ```
4.  Abre `http://localhost:5173` en tu navegador.

---

## 📂 Estructura del Proyecto

```
Calculadora-Android/
├── Calculadora Android Studio/   # Proyecto nativo de Android
│   ├── app/src/main/java/...     # Código fuente Java
│   └── app/src/main/res/...      # Recursos UI (layouts, drawables)
├── Calculadora figma/            # Implementación web del diseño
│   ├── src/app/components/       # Componentes React
│   └── guidelines/               # Documentación de diseño
└── README.md                     # Este archivo
```

## 📜 Créditos y Atribuciones

*   **Diseño Original**: Basado en [ETA Calculator](https://www.figma.com/design/PwYu8zkb1cf43vvVcy4UZ6/ETA-Calculator) en Figma.
*   **Iconos y UI**: [shadcn/ui](https://ui.shadcn.com/) bajo licencia MIT.
*   **Imágenes**: Recursos de [Unsplash](https://unsplash.com).

---

Desarrollado con ❤️ por Alberto.



---

# English Version

# Calculadora Android & Figma Design 📱

This project is a complete calculator solution that includes both a native implementation in **Android Studio** and a working prototype based on a **Figma** design.

## 🚀 Overview

The repository is split into two major sections:
1.  **Android Studio Calculator**: A native Java application for Android.
2.  **Figma Calculator**: A web implementation (React + Vite + Tailwind CSS) that faithfully reflects the Figma design and documentation.

---

## 📱 Android Studio Calculator

This is the main application for Android devices. It offers an intuitive interface with standard and advanced calculation capabilities.

### ✨ Features
*   **Basic Operations**: Addition, subtraction, multiplication and division.
*   **Advanced Functions**: Square root, squaring and percentage.
*   **Memory Management**: `M+` and `M-` functions to store temporary results.
*   **State Persistence**: Keeps current calculations even if the app restarts or the screen rotates.
*   **Adaptive Interface**: Designed to be clear and functional across different screen sizes.

### 🛠️ Technologies Used
*   **Language**: Java
*   **Environment**: Android Studio
*   **Components**: AppCompat, Material Design components.

### 🏃 How to Run
1.  Open the `Calculadora Android Studio` folder in **Android Studio**.
2.  Sync the project with the Gradle files.
3.  Connect your Android device or start an emulator.
4.  Click **'Run'**.

---

## 🎨 Figma Calculator (Web Prototype)

This section contains the fairly complete code derived directly from the Figma design, allowing you to preview the interface in a web environment before the final deployment.

### ✨ Features
*   **Design Fidelity**: Exact implementation of the design tokens and components defined in Figma.
*   **Interactivity**: A working prototype that performs basic calculations in the browser.
*   **Design Documentation**: Includes guides and resources used during the design phase.

### 🛠️ Technologies Used
*   **Framework**: React with TypeScript
*   **Bundler**: Vite
*   **Styles**: Tailwind CSS
*   **Components**: Based on shadcn/ui

### 🏃 How to Run
1.  Navigate to the `Calculadora figma` folder.
2.  Install the dependencies:
    ```bash
    npm install
    ```
3.  Start the development server:
    ```bash
    npm run dev
    ```
4.  Open `http://localhost:5173` in your browser.

---

## 📂 Project Structure

```
Calculadora-Android/
├── Calculadora Android Studio/   # Native Android project
│   ├── app/src/main/java/...     # Java source code
│   └── app/src/main/res/...      # UI resources (layouts, drawables)
├── Calculadora figma/            # Web implementation of the design
│   ├── src/app/components/       # React components
│   └── guidelines/               # Design documentation
└── README.md                     # This file
```

## 📜 Credits and Attributions

*   **Original Design**: Based on [ETA Calculator](https://www.figma.com/design/PwYu8zkb1cf43vvVcy4UZ6/ETA-Calculator) on Figma.
*   **Icons and UI**: [shadcn/ui](https://ui.shadcn.com/) under the MIT license.
*   **Images**: Resources from [Unsplash](https://unsplash.com).

---

Developed with ❤️ by Alberto.


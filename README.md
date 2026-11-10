# Calculadora Android & Figma

[Español](#español) · [English](#english)

---

## Español

### Índice

- [Descripción](#descripción)
- [Estructura del repositorio](#estructura-del-repositorio)
- [Aplicación Android](#aplicación-android)
  - [Funcionalidades de la app](#funcionalidades-de-la-app)
  - [Tecnologías de la app](#tecnologías-de-la-app)
  - [Requisitos de la app](#requisitos-de-la-app)
  - [Ejecución de la app](#ejecución-de-la-app)
- [Prototipo web (Figma)](#prototipo-web-figma)
  - [Funcionalidades del prototipo](#funcionalidades-del-prototipo)
  - [Tecnologías del prototipo](#tecnologías-del-prototipo)
  - [Requisitos del prototipo](#requisitos-del-prototipo)
  - [Ejecución del prototipo](#ejecución-del-prototipo)
- [Créditos y atribuciones](#créditos-y-atribuciones)
- [Licencia](#licencia)

### Descripción

**Calculadora Android & Figma** es una solución integral de calculadora que incluye dos implementaciones complementarias:

1. **Aplicación nativa para Android**, desarrollada en Java con Android Studio.
2. **Prototipo web funcional**, construido con React y TypeScript a partir del diseño original de Figma.

El objetivo es comparar una implementación nativa con una recreación web fiel al diseño, manteniendo la misma lógica de cálculo y una experiencia de usuario coherente.

### Estructura del repositorio

```text
Calculadora-Android/
├── Calculadora Android Studio/   # Aplicación nativa Android (Java)
│   ├── app/src/main/java/...     # Código fuente
│   ├── app/src/main/res/...      # Layouts, drawables y valores
│   ├── app/build.gradle.kts      # Configuración del módulo
│   └── settings.gradle.kts
├── Calculadora figma/            # Prototipo web (React + TypeScript)
│   ├── src/                      # Componentes y lógica
│   └── guidelines/               # Documentación de diseño
├── .gitignore
├── LICENSE                       # GPL-3.0
└── README.md
```

### Aplicación Android

Aplicación nativa destinada a dispositivos Android. Ofrece una interfaz intuitiva con capacidades de cálculo estándar y avanzadas.

#### Funcionalidades de la app

- **Operaciones básicas**: suma, resta, multiplicación y división.
- **Funciones avanzadas**: raíz cuadrada, elevado al cuadrado y porcentaje.
- **Gestión de memoria**: funciones `M+` y `M-` para almacenar resultados temporales.
- **Persistencia de estado**: mantiene el cálculo actual al rotar la pantalla o reiniciar la actividad.
- **Interfaz adaptativa**: diseñada para distintos tamaños de pantalla.

#### Tecnologías de la app

- **Lenguaje**: Java
- **Entorno**: Android Studio
- **Sistema de build**: Gradle con Kotlin DSL
- **Componentes**: AppCompat, Material Design, ConstraintLayout
- **SDK**: `minSdk 24`, `targetSdk 36`, `compileSdk 36`

#### Requisitos de la app

- Android Studio (versión estable reciente).
- JDK 11 o superior.
- Android SDK 36 instalado.
- Dispositivo o emulador con Android 7.0 (API 24) o superior.

#### Ejecución de la app

1. Abre la carpeta `Calculadora Android Studio` en **Android Studio**.
2. Espera a que Gradle sincronice el proyecto.
3. Conecta un dispositivo o inicia un emulador.
4. Pulsa **Run** (`Shift + F10`).

También puedes compilar desde la terminal:

```bash
cd "Calculadora Android Studio"
./gradlew assembleDebug
```

El APK se genera en `app/build/outputs/apk/debug/`.

### Prototipo web (Figma)

Implementación web derivada del diseño de Figma. Permite previsualizar la interfaz y probar la lógica de cálculo en el navegador antes de trasladarla a la app nativa.

#### Funcionalidades del prototipo

- **Fidelidad de diseño**: reproduce los tokens y componentes definidos en Figma.
- **Interactividad**: permite realizar cálculos básicos en el navegador.
- **Documentación de diseño**: incluye guías y recursos utilizados durante la fase de diseño.

#### Tecnologías del prototipo

- **Framework**: React 18 con TypeScript
- **Bundler**: Vite 6
- **Estilos**: Tailwind CSS 4
- **Componentes**: shadcn/ui, Radix UI y Material UI
- **Animaciones**: Motion

#### Requisitos del prototipo

- Node.js 18 o superior.
- npm (incluido con Node.js).

#### Ejecución del prototipo

```bash
cd "Calculadora figma"
npm install
npm run dev
```

Abre [http://localhost:5173](http://localhost:5173) en el navegador.

Para generar la versión de producción:

```bash
npm run build
```

### Créditos y atribuciones

- **Diseño original**: basado en [ETA Calculator](https://www.figma.com/design/PwYu8zkb1cf43vvVcy4UZ6/ETA-Calculator) en Figma.
- **Iconos y UI**: [shadcn/ui](https://ui.shadcn.com/) bajo licencia MIT.
- **Imágenes**: recursos de [Unsplash](https://unsplash.com).
- Consulta también [Calculadora figma/ATTRIBUTIONS.md](Calculadora%20figma/ATTRIBUTIONS.md).

### Licencia

Este proyecto se distribuye bajo la **GNU General Public License v3.0 (GPL-3.0)**. Consulta el archivo [LICENSE](LICENSE) para más detalles.

---

## English

### Table of contents

- [Overview](#overview)
- [Repository structure](#repository-structure)
- [Android app](#android-app)
  - [Android app features](#android-app-features)
  - [Android tech stack](#android-tech-stack)
  - [Android requirements](#android-requirements)
  - [Running the Android app](#running-the-android-app)
- [Web prototype (Figma)](#web-prototype-figma)
  - [Web prototype features](#web-prototype-features)
  - [Web tech stack](#web-tech-stack)
  - [Web requirements](#web-requirements)
  - [Running the web prototype](#running-the-web-prototype)
- [Credits and attributions](#credits-and-attributions)
- [License](#license)

### Overview

**Calculadora Android & Figma** is a complete calculator solution with two complementary implementations:

1. **Native Android app**, built in Java with Android Studio.
2. **Functional web prototype**, built with React and TypeScript from the original Figma design.

The goal is to compare a native implementation with a design-faithful web recreation while keeping the same calculation logic and a consistent user experience.

### Repository structure

```text
Calculadora-Android/
├── Calculadora Android Studio/   # Native Android app (Java)
│   ├── app/src/main/java/...     # Source code
│   ├── app/src/main/res/...      # Layouts, drawables and values
│   ├── app/build.gradle.kts      # Module configuration
│   └── settings.gradle.kts
├── Calculadora figma/            # Web prototype (React + TypeScript)
│   ├── src/                      # Components and logic
│   └── guidelines/               # Design documentation
├── .gitignore
├── LICENSE                       # GPL-3.0
└── README.md
```

### Android app

Native Android application offering an intuitive interface with standard and advanced calculation capabilities.

#### Android app features

- **Basic operations**: addition, subtraction, multiplication and division.
- **Advanced functions**: square root, squaring and percentage.
- **Memory management**: `M+` and `M-` functions to store temporary results.
- **State persistence**: keeps the current calculation across screen rotations or activity restarts.
- **Adaptive interface**: designed for different screen sizes.

#### Android tech stack

- **Language**: Java
- **IDE**: Android Studio
- **Build system**: Gradle with Kotlin DSL
- **Components**: AppCompat, Material Design, ConstraintLayout
- **SDK**: `minSdk 24`, `targetSdk 36`, `compileSdk 36`

#### Android requirements

- Android Studio (recent stable release).
- JDK 11 or later.
- Android SDK 36 installed.
- A device or emulator running Android 7.0 (API 24) or later.

#### Running the Android app

1. Open the `Calculadora Android Studio` folder in **Android Studio**.
2. Wait for Gradle to sync the project.
3. Connect a device or start an emulator.
4. Click **Run** (`Shift + F10`).

You can also build from the terminal:

```bash
cd "Calculadora Android Studio"
./gradlew assembleDebug
```

The APK is generated in `app/build/outputs/apk/debug/`.

### Web prototype (Figma)

Web implementation derived from the Figma design. It lets you preview the interface and test the calculation logic in the browser before porting it to the native app.

#### Web prototype features

- **Design fidelity**: reproduces the design tokens and components defined in Figma.
- **Interactivity**: performs basic calculations in the browser.
- **Design documentation**: includes the guides and resources used during the design phase.

#### Web tech stack

- **Framework**: React 18 with TypeScript
- **Bundler**: Vite 6
- **Styling**: Tailwind CSS 4
- **Components**: shadcn/ui, Radix UI and Material UI
- **Animations**: Motion

#### Web requirements

- Node.js 18 or later.
- npm (bundled with Node.js).

#### Running the web prototype

```bash
cd "Calculadora figma"
npm install
npm run dev
```

Open [http://localhost:5173](http://localhost:5173) in your browser.

To create a production build:

```bash
npm run build
```

### Credits and attributions

- **Original design**: based on [ETA Calculator](https://www.figma.com/design/PwYu8zkb1cf43vvVcy4UZ6/ETA-Calculator) on Figma.
- **Icons and UI**: [shadcn/ui](https://ui.shadcn.com/) under the MIT license.
- **Images**: resources from [Unsplash](https://unsplash.com).
- See also [Calculadora figma/ATTRIBUTIONS.md](Calculadora%20figma/ATTRIBUTIONS.md).

### License

This project is distributed under the **GNU General Public License v3.0 (GPL-3.0)**. See the [LICENSE](LICENSE) file for details.

# Sargam Icons for Compose Multiplatform

A **Compose Multiplatform library of Sargam Icons** for Jetpack Compose.

**Sargam IconCompose** brings the Sargam icon pack to **Jetpack Compose and Compose Multiplatform** using optimized `ImageVectors`.

The library provides a clean and simple API designed to feel natural for Compose developers.

---

## ✨ Features

* Complete **Sargam icon set**
* Optimized **ImageVector icons**
* Works with **Jetpack Compose**
* Compatible with **Compose Multiplatform**
* Lightweight and fast
* Clean and developer-friendly API

---

## 📦 Installation

Add the dependency to your `build.gradle.kts`:

```kotlin
implementation("io.github.dev778g-me:sargamicon-compose:1.0.0")
```

Sync your project after adding the dependency.

---

## 🧩 Icon Styles

Sargam icons are available in multiple styles.

```kotlin
object Sargam {
  object Filled
  object Duotone
  object Regular
}
```

Each icon can be accessed through these style objects.

---

## 🚀 Usage

Basic usage with the Compose `Icon` component:

```kotlin
Icon(
  imageVector = Sargam.Filled.SiHeart,
  contentDescription = null
)
```

Duotone icon:

```kotlin
Icon(
  imageVector = Sargam.Duotone.SiHeart,
  contentDescription = null
)
```

Regular icon:

```kotlin
Icon(
  imageVector = Sargam.Regular.SiHeart,
  contentDescription = null
)
```

---

## 🎨 Example

```kotlin
Column {

  Icon(
    imageVector = Sargam.Filled.SiHeart,
    contentDescription = null
  )

  Spacer(
    modifier = Modifier.height(12.dp)
  )

  Icon(
    imageVector = Sargam.Duotone.SiHeart,
    contentDescription = null
  )

  Spacer(
    modifier = Modifier.height(12.dp)
  )

  Icon(
    imageVector = Sargam.Regular.SiHeart,
    contentDescription = null
  )

}
```

---

## 🖥 Supported Platforms

* Android
* Desktop
* JVM
* Compose Multiplatform

---

## 📚 About Sargam Icons

Sargam Icons is a modern open-source icon set designed for building beautiful user interfaces.

Official website:
https://sargamicons.com/

---

## 📄 License

Sargam Icons and this Compose wrapper library are licensed under the **MIT License**.

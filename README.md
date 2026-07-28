# SVG

A minimal interface for SVG path providers in Java.

## Features

- 🪶 Lightweight - a single interface, no dependencies
- ☕ Works in any Java context
- 📐 Designed as a contract for SVG libraries such as [SVG-FontAwesome](https://github.com/Maran23/svg-fontawesome)

## Requirements

| Dependency | Version |
|------------|---------|
| Java       | 25+     |

## Installation

### Maven

```xml
<dependency>
    <groupId>tools.maran</groupId>
    <artifactId>svg</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Gradle

```groovy
implementation 'tools.maran:svg:1.0.0'
```

## Example Usage

```
public enum MyIcons implements SVG {
    HOME("M10 20v-6h4v6h5v-8h3L12 3 2 12h3v8z");

    private final String path;

    MyIcons(String path) {
        this.path = path;
    }

    @Override
    public final String path() {
        return path;
    }

    @Override
    public String toString() {
        return path;
    }
}
```

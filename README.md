## Modeling iPhone Functions

![Static Badge](https://img.shields.io/badge/programming_language-java-orange?style=flat-square)
[![Twitter/X: @rkauefraga](https://img.shields.io/badge/twitter%2Fx-%40bfrluis_-blue)](https://x.com/bfrluis_) 
![LinkedIn: lukkk](https://img.shields.io/badge/discord-lukk._.-5865F2)

This repository is a challenge proposed by [DIO](https://www.dio.me/en) (Digital Innovation One) - **"Formação Claro - Java com Spring Boot"**.

### Challenge proposal 📝
In this challenge the proposal was to apply business analysis concepts and object-oriented programming requirements and UML modeling to build the model of classes and interfaces in order to simulate the features of the first iPhone: Music Player, Telephone Calls and Internet Browser.

### My UML diagram representation 📈
```mermaid
classDiagram
    class Spotify {
        +play()
        +pause()
        +selectSong(String music)
    }

    class Phone {
        +call(String number)
        +answerThePhone()
        +voiceMail()
    }

    class Browser {
        +displayPage(String url)
        +newTab()
        +reloadPage()
    }

    class iPhone {
    }

    iPhone --> Spotify
    iPhone --> Phone
    iPhone --> Browser
```
> [!NOTE]
> The diagram model above was built with the tools available on the [Mermaid](https://mermaid.js.org/) website.

### Contributing 🤝
Did you find any syntax errors or other problems? No problem! Open an Issue in the repository or make a fork, leaving the commits with descriptive messages and send the pull request!

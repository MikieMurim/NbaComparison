# NBA Player Comparison Tool

## Overview
The NBA Player Comparison Tool is a Java-based application designed to compare the performance statistics of two basketball players. Using a publicly available NBA API, the tool fetches detailed player stats and displays them side by side for easy comparison. This project aims to help basketball enthusiasts, analysts, and fans gain deeper insights into player performance.

## Key Features
- **Search for Players:** Users can search for two NBA players by their names.
- **Stat Comparison:** Fetch and display key statistics such as points, rebounds, assists, steals, and more.
- **User-Friendly Interface:** Initially a console-based application, with plans for a graphical interface using JavaFX.
- **Real-Time Data:** Retrieves up-to-date stats via an NBA API.
- **Advanced Filters (Future):** Compare stats by season, game type (regular season vs. playoffs), or advanced metrics.

## Technologies Used
- **Programming Language:** Java (JDK 11+)
- **API Integration:** RESTful API for NBA stats
- **JSON Parsing:** Gson or Jackson library
- **HTTP Requests:** Java HttpClient or OkHttp library
- **Optional Database:** SQLite or MySQL for caching player data
- **Future GUI:** JavaFX for graphical interface development

## Goals
- Provide a tool to easily compare NBA players’ performances.
- Enhance Java skills by working with APIs, JSON parsing, and UI development.
- Potentially expand the tool to include features like exporting comparisons, visualizations, and historical data analysis.

## How It Works
1. The user inputs the names of two players.
2. The tool queries the NBA API to retrieve detailed statistics for both players.
3. The stats are parsed and displayed in a clear, side-by-side format.
4. (Optional) Advanced metrics and visualizations will be added in future updates.

---
This tool is a work in progress and is part of an effort to explore Java development and sports analytics.


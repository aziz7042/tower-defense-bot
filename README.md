# Tower Defense Bot

A Java strategy bot for a university tower-defense contest framework. The bot identifies the active map, selects an affordable tower category and places towers at map-specific strategic coordinates.

## What the code demonstrates

- Integration with an external game/controller API
- Map-aware strategy selection
- Budget checks before placement
- Ordered placement plans for supported layouts
- A small, deterministic decision policy that is easy to inspect

## Scope

Only Aziz's `MyBot.java` is included; the upstream contest engine is intentionally excluded and is not claimed as original work. The available bot implements **tower selection and placement**. It does not contain tower-upgrade logic, so this repository makes no upgrade claim.

The project will require the course's framework JARs or source on the classpath to compile. Those dependencies are not redistributed here.

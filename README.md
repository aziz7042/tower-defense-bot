# Tower Defense Bot

A Java strategy bot for a university tower-defense contest framework. The bot identifies the active map, selects an affordable tower category and places towers at map-specific strategic coordinates.

## What the code demonstrates

- Integration with an external game/controller API
- Map-aware strategy selection
- Budget checks before placement
- Ordered placement plans for supported layouts
- A small, deterministic decision policy that is easy to inspect

## What's included

Only Aziz's `MyBot.java` is included. The contest engine belongs to the course framework and is not part of this repository. The bot implements **tower selection and placement**; this version does not include tower-upgrade logic.

The project will require the course's framework JARs or source on the classpath to compile. Those dependencies are not redistributed here.

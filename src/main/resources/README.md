two questions:

1. Can I use two schemas and data sqls?
For example, one for devl testing, and another for prod testing?
Well, I know I can set up two different data sources, so potentially it would work
if I could tell Spring to choose a specific sql file.

2. Can I create "schemas" with an H2 source?
For example, NORTH_POLE.POLAR_BEAR and SOUTH_POLE.PENGUIN
Yes. No problem. Use CREATE SCHEMA <SCHEMA_NAME>
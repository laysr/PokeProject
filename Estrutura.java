PokeProject Java
Seres Inanimados {
Ambient
Pokemon Center
Pokemon food
Rare candy }

Seres animados {
Pokemons  [Type (water, fire, ground, dragon, grass, bug, flying, ice, psichic, poison ...)] }
Funções {
Attacks = enemy pokemon - HP, - HP = ally pokemon Power * attack variable
K.O. = + exp to winner, loser HP = 0
Consumo de food = + energy ally pokemon}
Energy system {
Loss: 100% - x%
Gain: x% + y% }
HP system {
Depends on level
100 + 5*level
When HP = 0, Pokemon Center brings Hp = 100% }
Levels system {
1~100 }
Exp system {
level 1 = 100 exp
+25% per level }
Evolution system {
Lvl: 16, 36, 67, 90. }
Properties {
Pokemon in general: height, weight, power (depends on level, power = 0.5*level)
Type: attacks allowed, weakness
Specific pokemon: attacks learned
Attacks {
Double slap = Any pokemon, var = 16
Thundershock = Electric pokemons only, var = 48
Flamethrower = Fire pokemons only, var = 50
Hydro pump = Water pokemons only, var = 52
Fly = Flying pokemons only, var = 50
Mud-slap = Ground pokemons only, var = 20
Earthquake = Ground pokemons only, var = 52
Dig = Ground pokemons only, var = 50
Vine whip = Grass pokemons only, var = 26
Razor leaf = Grass pokemons only, var = 46
Mega drain = Grass pokemons only, var = 30, enemy HP loss = ally HP gain
Leech life = Bug pokemons only, var = 10, enemy HP loss = ally HP gain
Dragon breath = Dragon pokemons only, var = 52
Karate Chop = Fighting pokemons only, var = 44
Shadow Ball = Ghost pokemons only, var = 40
Ice beam = Ice pokemons only, var = 44
Blizzard = Ice pokemons only, var = 48
Aurora beam = Ice pokemons only, var = 38
Poison sting = Poison pokemons only, var = 28
Acid = Poison pokemons only, var = 38
Poison fang = Poison pokemons only, var = 46
Psybeam = Psychic pokemons only, var = 36
Psychic = Psychic pokemons only, var = 48
Extrasensory = Psychic pokemons only, var = 46} }
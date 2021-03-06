package me.rhin.openciv.server.game.map.tile.improvement;

import me.rhin.openciv.server.game.map.tile.TileType;
import me.rhin.openciv.server.game.research.Technology;
import me.rhin.openciv.server.game.research.type.MiningTech;

public class MineImprovement extends TileImprovement {

	public MineImprovement(TileType tileType, int turns) {
		super(tileType, turns);
	}

	@Override
	public Class<? extends Technology> getRequiredTech() {
		return MiningTech.class;
	}
	
	@Override
	public String getName() {
		return "mine";
	}
}

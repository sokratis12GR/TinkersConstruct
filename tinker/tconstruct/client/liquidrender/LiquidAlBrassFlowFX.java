package tinker.tconstruct.client.liquidrender;

import tinker.tconstruct.TContent;

public class LiquidAlBrassFlowFX extends TextureLiquidFlowingFX
{
	public LiquidAlBrassFlowFX()
	{
		super(200, 255, 165, 255, 20, 100, TContent.alBrassFlowing.blockIndexInTexture+1, TContent.alBrassFlowing.getTextureFile());
	}
}
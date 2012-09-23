package co.uk.flansmods.client;

import org.lwjgl.opengl.GL11;

import co.uk.flansmods.common.teams.EntityFlagpole;
import net.minecraft.src.Entity;
import net.minecraft.src.Render;

public class RenderFlagpole extends Render
{
	public ModelFlagpole modelFlagpole;
	
	public RenderFlagpole()
	{
		modelFlagpole = new ModelFlagpole();
	}
	
	@Override
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) 
	{
		EntityFlagpole flagpole = (EntityFlagpole)entity;
		GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(f, 0.0F, 1.0F, 0.0F);
        
        loadTexture("/teamsMod/Flagpole.png");
		
        GL11.glScalef(-1F, -1F, 1F);
        GL11.glColor3f(1F, 1F, 1F);
        
        modelFlagpole.renderPole(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, flagpole);
		GL11.glPopMatrix();
	}

}
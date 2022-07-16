package lithiumstudio.mf.client.model;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

import static lithiumstudio.mf.MineFurry.*;


public class FurryModel<T extends Entity> extends EntityModel<T>
{

	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(MODID, "entity_furry"), "main");
	private final ModelPart Legs;
	private final ModelPart Arms;
	private final ModelPart Head;
	private final ModelPart Tail;
	private final ModelPart bb_main;

	public FurryModel(ModelPart root)
	{
		this.Legs = root.getChild("Legs");
		this.Arms = root.getChild("Arms");
		this.Head = root.getChild("Head");
		this.Tail = root.getChild("Tail");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer()
	{
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Legs = partdefinition.addOrReplaceChild("Legs", CubeListBuilder.create().texOffs(16, 32).addBox(-4.0F, -12.0F, 0.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(32, 0).addBox(0.0F, -12.0F, 0.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Arms = partdefinition.addOrReplaceChild("Arms", CubeListBuilder.create().texOffs(0, 32).addBox(-8.0F, -24.0F, 0.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(24, 16).addBox(4.0F, -24.0F, 0.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -32.0F, -2.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(40, 26).addBox(-2.0F, -27.0F, -4.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Ears = Head.addOrReplaceChild("Ears", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightEar = Ears.addOrReplaceChild("RightEar", CubeListBuilder.create().texOffs(4, 4).addBox(-5.0F, -33.0F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 0).addBox(-4.0F, -33.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 16).addBox(-3.0F, -32.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LeftEar = Ears.addOrReplaceChild("LeftEar", CubeListBuilder.create().texOffs(0, 4).addBox(-3.0F, -33.0F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(23, 18).addBox(-4.0F, -33.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-5.0F, -32.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 0.0F, 0.0F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(40, 21).addBox(-2.0F, -14.0F, 4.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(40, 16).addBox(-2.0F, -13.0F, 5.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 37).addBox(-2.0F, -12.0F, 6.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 32).addBox(-2.0F, -11.0F, 7.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -9.0F, 8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -24.0F, 0.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
	{

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha)
	{
		Legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}


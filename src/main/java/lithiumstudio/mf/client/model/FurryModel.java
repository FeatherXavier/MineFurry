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
import org.jetbrains.annotations.NotNull;

public class FurryModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("mf", "entity_furry"), "main");
	private final ModelPart Head;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart Tail;
	private final ModelPart bb_main;

	public FurryModel(ModelPart root) {
		this.Head = root.getChild("Head");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Tail = root.getChild("Tail");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition ears = Head.addOrReplaceChild("ears", CubeListBuilder.create(), PartPose.offset(8.0F, 25.0F, -8.0F));

		PartDefinition rightear = ears.addOrReplaceChild("rightear", CubeListBuilder.create().texOffs(55, 60).addBox(-4.25F, -29.0F, 4.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.52F))
		.texOffs(56, 59).addBox(-5.5F, -29.0F, 4.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.52F))
		.texOffs(56, 60).addBox(-5.0F, -29.0F, 4.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.52F))
		.texOffs(57, 59).addBox(-4.25F, -28.0F, 4.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.52F))
		.texOffs(58, 60).addBox(-4.25F, -27.0F, 4.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.52F))
		.texOffs(55, 58).addBox(-6.5F, -27.55F, 4.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.52F))
		.texOffs(56, 60).addBox(-6.5F, -28.0F, 4.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.52F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftear = ears.addOrReplaceChild("leftear", CubeListBuilder.create().texOffs(55, 60).addBox(-9.75F, -29.0F, 4.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.52F))
		.texOffs(56, 59).addBox(-8.5F, -29.0F, 4.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.52F))
		.texOffs(56, 60).addBox(-9.25F, -29.0F, 4.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.52F))
		.texOffs(57, 59).addBox(-9.75F, -28.0F, 4.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.52F))
		.texOffs(58, 60).addBox(-9.75F, -27.0F, 4.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.52F))
		.texOffs(55, 58).addBox(-7.5F, -27.55F, 4.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.52F))
		.texOffs(56, 60).addBox(-7.5F, -28.0F, 4.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.52F)), PartPose.offset(-2.0F, 0.0F, 0.0F));

		PartDefinition NOSE = Head.addOrReplaceChild("NOSE", CubeListBuilder.create().texOffs(8, 60).addBox(-7.625F, -22.25F, 3.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(1.0F))
		.texOffs(7, 60).addBox(-8.5F, -22.25F, 3.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(1.0F))
		.texOffs(7, 60).addBox(-7.625F, -22.25F, 2.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(1.0F))
		.texOffs(7, 59).addBox(-8.5F, -22.25F, 2.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(1.0F))
		.texOffs(55, 60).addBox(-7.8F, -23.0F, 1.5F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.5F))
		.texOffs(55, 60).addBox(-8.2F, -23.0F, 1.5F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.5F)), PartPose.offset(8.0F, 25.0F, -8.0F));

		PartDefinition EYES = Head.addOrReplaceChild("EYES", CubeListBuilder.create().texOffs(4, 60).addBox(-12.0F, -26.0F, 4.125F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(4, 60).addBox(-8.0F, -26.0F, 4.125F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 25.0F, -8.0F));

		PartDefinition eyes2 = EYES.addOrReplaceChild("eyes2", CubeListBuilder.create().texOffs(60, 33).addBox(-10.0F, -23.625F, 4.45F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.36F))
		.texOffs(2, 43).addBox(-10.1F, -24.5F, 4.24F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.16F))
		.texOffs(8, 40).addBox(-10.0F, -24.35F, 4.45F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.36F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition eyes3 = EYES.addOrReplaceChild("eyes3", CubeListBuilder.create().texOffs(60, 33).addBox(-6.0F, -23.625F, 4.45F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.36F))
		.texOffs(2, 43).addBox(-6.1F, -24.5F, 4.24F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.16F))
		.texOffs(8, 40).addBox(-6.0F, -24.35F, 4.45F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.36F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition eyebrow = Head.addOrReplaceChild("eyebrow", CubeListBuilder.create().texOffs(14, 43).addBox(-5.0F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-5.2F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-5.4F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-5.6F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-5.8F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-6.0F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-6.2F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-6.4F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-6.6F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-6.8F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-7.0F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-7.2F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F)), PartPose.offset(8.0F, 25.0F, -8.0F));

		PartDefinition eyebrow3 = Head.addOrReplaceChild("eyebrow3", CubeListBuilder.create().texOffs(14, 43).addBox(-11.0F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-10.8F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-10.6F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-10.4F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-10.2F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-10.0F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-9.8F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-9.6F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-9.4F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-9.2F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-9.0F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(14, 43).addBox(-8.8F, -25.5F, 4.05F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F)), PartPose.offset(8.0F, 25.0F, -8.0F));

		PartDefinition eyebrow2 = Head.addOrReplaceChild("eyebrow2", CubeListBuilder.create().texOffs(27, 32).addBox(-7.6F, -21.9F, 1.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(27, 32).addBox(-7.4F, -22.1F, 1.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(27, 32).addBox(-8.6F, -21.9F, 1.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(27, 32).addBox(-8.4F, -21.9F, 1.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(27, 32).addBox(-8.2F, -21.9F, 1.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(27, 32).addBox(-8.0F, -21.9F, 1.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
		.texOffs(27, 32).addBox(-7.8F, -21.9F, 1.25F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F)), PartPose.offset(8.0F, 25.0F, -8.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 13.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 0.0F, 0.0F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.0F, 2.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Tail_r1 = Tail.addOrReplaceChild("Tail_r1", CubeListBuilder.create().texOffs(33, 32).addBox(0.0F, -4.5F, -2.5F, 0.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 4.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(@NotNull T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
	{
		this.Head.xRot =(float) (Math.PI / 180) * headPitch;
		this.Head.yRot =(float) (Math.PI / 180) * netHeadYaw;
		this.RightLeg.xRot =(float) Math.cos(limbSwing * 0.6662F) * limbSwingAmount * 1.25F * -1.0F;
		this.LeftLeg.xRot =(float) Math.cos(limbSwing * 0.6662F) * limbSwingAmount * 1.25F;
		this.RightArm.xRot =(float) Math.cos(limbSwing * 0.6662F) * limbSwingAmount * 1.25F;
		this.LeftArm.xRot = (float) Math.cos(limbSwing * 0.6662F) * limbSwingAmount * 1.25F * -1.0F;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
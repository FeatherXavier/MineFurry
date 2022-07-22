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


public class FurryModel<T extends Entity> extends EntityModel<T>
{
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("mf", "entity_furry"), "main");
	private final ModelPart root;

	public FurryModel(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, 1.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 20.0F, 0.0F));

		PartDefinition leftleg_r1 = root.addOrReplaceChild("leftleg_r1", CubeListBuilder.create().texOffs(4, 12).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0F, 0.5F, 0.0F, 0.0F, 0.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(4, 4).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition leftarm_r1 = body.addOrReplaceChild("leftarm_r1", CubeListBuilder.create().texOffs(8, 12).addBox(0.0F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.5F, 0.5F, 0.0F, 0.0F, 0.0F));

		PartDefinition rightarm_r1 = body.addOrReplaceChild("rightarm_r1", CubeListBuilder.create().texOffs(10, 4).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.5F, 0.5F, 0.0F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ears = head.addOrReplaceChild("ears", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftear = ears.addOrReplaceChild("leftear", CubeListBuilder.create().texOffs(14, 15).addBox(1.0F, -5.0F, -0.47F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.13F))
				.texOffs(14, 15).addBox(0.7F, -5.0F, -0.47F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.13F))
				.texOffs(14, 15).addBox(0.76F, -5.0F, -0.47F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.13F))
				.texOffs(14, 15).addBox(1.0F, -4.77F, -0.47F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.13F))
				.texOffs(14, 15).addBox(0.42F, -4.71F, -0.47F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.13F))
				.texOffs(14, 15).addBox(1.0F, -4.55F, -0.47F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.13F))
				.texOffs(14, 15).addBox(1.0F, -4.48F, -0.47F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.13F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rightear = ears.addOrReplaceChild("rightear", CubeListBuilder.create().texOffs(14, 15).addBox(1.0F, -5.0F, -0.47F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.13F))
				.texOffs(14, 15).addBox(1.3F, -5.0F, -0.47F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.13F))
				.texOffs(14, 15).addBox(1.24F, -5.0F, -0.47F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.13F))
				.texOffs(14, 15).addBox(1.0F, -4.77F, -0.47F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.13F))
				.texOffs(14, 15).addBox(1.58F, -4.71F, -0.47F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.13F))
				.texOffs(14, 15).addBox(1.0F, -4.55F, -0.47F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.13F))
				.texOffs(14, 15).addBox(1.0F, -4.48F, -0.47F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.13F)), PartPose.offset(-2.0F, 0.0F, 0.0F));

		PartDefinition nose = head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(2, 15).addBox(-0.125F, -3.25F, -0.75F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.25F))
				.texOffs(2, 15).addBox(-0.125F, -3.25F, -1.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.25F))
				.texOffs(2, 15).addBox(0.125F, -3.25F, -1.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.25F))
				.texOffs(2, 15).addBox(0.125F, -3.25F, -0.75F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.25F))
				.texOffs(14, 15).addBox(-0.062F, -3.42F, -1.15F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.125F))
				.texOffs(14, 15).addBox(-0.062F, -3.42F, -1.1F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.125F))
				.texOffs(14, 15).addBox(0.062F, -3.42F, -1.15F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.125F))
				.texOffs(14, 15).addBox(0.062F, -3.42F, -1.1F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.125F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition eyes = head.addOrReplaceChild("eyes", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -4.0F, -0.48F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(0.0F, -4.0F, -0.48F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition righteye = eyes.addOrReplaceChild("righteye", CubeListBuilder.create().texOffs(2, 11).addBox(-0.5F, -3.625F, -0.39F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.09F))
				.texOffs(0, 11).addBox(-0.55F, -3.85F, -0.461F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.02F))
				.texOffs(2, 10).addBox(-0.5F, -3.8F, -0.39F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.09F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lefteye = eyes.addOrReplaceChild("lefteye", CubeListBuilder.create().texOffs(2, 11).addBox(0.5F, -3.625F, -0.39F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.09F))
				.texOffs(0, 11).addBox(0.45F, -3.85F, -0.461F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.02F))
				.texOffs(2, 10).addBox(0.5F, -3.8F, -0.39F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.09F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

}


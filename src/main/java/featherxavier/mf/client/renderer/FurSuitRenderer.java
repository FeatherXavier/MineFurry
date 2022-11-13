package featherxavier.mf.client.renderer;

import featherxavier.mf.armor.FurSuit;
import featherxavier.mf.client.model.FurSuitModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class FurSuitRenderer extends GeoArmorRenderer<FurSuit>
{

    public FurSuitRenderer() {
        super(new FurSuitModel());

        this.headBone = "Head";
        this.bodyBone = "chestplate";
        this.rightArmBone = "rightArm";
        this.leftArmBone = "leftArm";
        this.rightLegBone = "rightLeg";
        this.leftLegBone = "leftLeg";
        this.rightBootBone = "rightBoot";
        this.leftBootBone = "leftBoot";
    }
}

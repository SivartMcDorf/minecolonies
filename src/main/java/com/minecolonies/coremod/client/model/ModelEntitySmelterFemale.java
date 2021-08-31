// Made with Blockbench 3.5.1
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
package com.minecolonies.coremod.client.model;

import com.minecolonies.api.IMinecoloniesAPI;
import com.minecolonies.api.client.render.modeltype.BipedModelType;
import com.minecolonies.api.client.render.modeltype.CitizenModel;
import com.minecolonies.api.entity.citizen.AbstractEntityCitizen;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.model.HumanoidModel;

public class ModelEntitySmelterFemale extends CitizenModel<AbstractEntityCitizen>
{

    public ModelEntitySmelterFemale(final ModelPart part)
    {
        super(part);
        hat.visible = false;
    }

    public static LayerDefinition createMesh()
    {
        MeshDefinition meshdefinition = HumanoidModel.createMesh(CubeDeformation.NONE, 0.0F);
        PartDefinition partDefinition = meshdefinition.getRoot();

        PartDefinition rightArmDefinition = partDefinition.addOrReplaceChild("right_arm",
          CubeListBuilder.create()
            .texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F).mirror()
          , PartPose.offset(-5.0F, 2.0F, 0.0F));

        PartDefinition leftArmDefinition = partDefinition.addOrReplaceChild("left_arm",
          CubeListBuilder.create()
            .texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F)
          , PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition rightLegDefinition = partDefinition.addOrReplaceChild("right_leg",
          CubeListBuilder.create()
            .texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F)
          , PartPose.offset(-2.0F, 12.0F, 0.0F));

        PartDefinition leftLegDefinition = partDefinition.addOrReplaceChild("left_leg",
          CubeListBuilder.create()
            .texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F).mirror()
          , PartPose.offset(2.0F, 12.0F, 0.0F));

        PartDefinition bodyDefinition = partDefinition.addOrReplaceChild("body",
          CubeListBuilder.create()
            .texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F)
          , PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition toolHandle1Definition = bodyDefinition.addOrReplaceChild("toolHandle1",
          CubeListBuilder.create()
            .texOffs(0, 32).addBox(0.0F, 0.0F, 0.0F, 4.0F, 3.0F, 1.0F).mirror()
          , PartPose.offset(-2.0F, 8.0F, -3.0F));

        PartDefinition toolHandle2Definition = bodyDefinition.addOrReplaceChild("toolHandle2",
          CubeListBuilder.create()
            .texOffs(10, 32).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F).mirror()
          , PartPose.offset(-1.0F, 6.0F, -3.0F));

        PartDefinition pocketDefinition = bodyDefinition.addOrReplaceChild("pocket",
          CubeListBuilder.create()
            .texOffs(10, 32).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F).mirror()
          , PartPose.offset(1.0F, 6.0F, -3.0F));

        PartDefinition bipedChestDefinition = bodyDefinition.addOrReplaceChild("bipedChest",
          CubeListBuilder.create()
            .texOffs(0, 55).addBox(-3.5F, 2.7F, -0.6F, 7.0F, 3.0F, 4.0F).mirror()
          , PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5934F, 0.0F, 0.0F));

        PartDefinition headDefinition = partDefinition.addOrReplaceChild("head",
          CubeListBuilder.create()
            .texOffs(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F).mirror()
            .texOffs(32, 0).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)).mirror()
          , PartPose.offset(0.0F, 25.0F, 0.0F));

        PartDefinition headDetailDefinition = headDefinition.addOrReplaceChild("headDetail",
          CubeListBuilder.create()
            .texOffs(32, 0).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)).mirror()
          , PartPose.offset(0.0F, 25.0F, 0.0F));

        PartDefinition ponytailBDefinition = headDefinition.addOrReplaceChild("ponytailB",
          CubeListBuilder.create()
            .texOffs(80, 40).addBox(-0.5F, 2.4F, 3.7F, 1.0F, 5.0F, 1.0F).mirror()
          , PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1047F, 0.0F, 0.0F));

        PartDefinition ponytailTDefinition = headDefinition.addOrReplaceChild("ponytailT",
          CubeListBuilder.create()
            .texOffs(79, 33).addBox(-1.0F, -2.0F, 3.4F, 2.0F, 5.0F, 1.0F).mirror()
          , PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2269F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 64);
    }
}

package com.brandon3055.draconicevolution.client.model;

import com.brandon3055.draconicevolution.helpers.ResourceHelperDE;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;


public class ModelWyvernArmor extends ModelBiped {

    public ModelRenderOBJ head;
    public ModelRenderOBJ body;
    public ModelRenderOBJ rightArm;
    public ModelRenderOBJ leftArm;
    public ModelRenderOBJ belt;
    public ModelRenderOBJ rightLeg;
    public ModelRenderOBJ leftLeg;
    public ModelRenderOBJ rightBoot;
    public ModelRenderOBJ leftBoot;

    public ModelWyvernArmor(float modelSize, boolean isHelmet, boolean isChestPiece, boolean isLeggings, boolean isdBoots) {
        super(modelSize);

//        this.bipedHead = new ModelRenderer(this, 0, 0);
//        this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
//        this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
//
//        this.bipedBody = new ModelRenderer(this, 16, 16);
//        this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
//        this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
//
//        this.bipedLeftArm = new ModelRenderer(this, 40, 16);
//        this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
//        this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
//
//        this.bipedRightArm = new ModelRenderer(this, 40, 16);
//        this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
//        this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
//
//        this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
//        this.bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
//        this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
//
//        this.bipedRightLeg = new ModelRenderer(this, 0, 16);
//        this.bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
//        this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);


        this.head = new ModelRenderOBJ(this, ResourceHelperDE.getResource("models/armor/wyvernHelmet.obj"), ResourceHelperDE.getResource("models/armor/WyvernHelmet"));
        this.body = new ModelRenderOBJ(this, ResourceHelperDE.getResource("models/armor/wyvernBody.obj"), ResourceHelperDE.getResource("models/armor/wyvernBody"));
        this.rightArm = new ModelRenderOBJ(this, ResourceHelperDE.getResource("models/armor/wyvernRightArm.obj"), ResourceHelperDE.getResource("models/armor/wyvernRightArm"));
        this.leftArm = new ModelRenderOBJ(this, ResourceHelperDE.getResource("models/armor/wyvernLeftArm.obj"), ResourceHelperDE.getResource("models/armor/wyvernLeftArm"));
        this.belt = new ModelRenderOBJ(this, ResourceHelperDE.getResource("models/armor/wyvernBelt.obj"), ResourceHelperDE.getResource("models/armor/wyvernBelt"));
        this.rightLeg = new ModelRenderOBJ(this, ResourceHelperDE.getResource("models/armor/wyvernRightLeg.obj"), ResourceHelperDE.getResource("models/armor/wyvernRightLeg"));
        this.leftLeg = new ModelRenderOBJ(this, ResourceHelperDE.getResource("models/armor/wyvernLeftLeg.obj"), ResourceHelperDE.getResource("models/armor/wyvernLeftLeg"));
        this.rightBoot = new ModelRenderOBJ(this, ResourceHelperDE.getResource("models/armor/wyvernRightBoot.obj"), ResourceHelperDE.getResource("models/armor/wyvernRightBoot"));
        this.leftBoot = new ModelRenderOBJ(this, ResourceHelperDE.getResource("models/armor/wyvernLeftBoot.obj"), ResourceHelperDE.getResource("models/armor/wyvernLeftBoot"));

        this.bipedHead.cubeList.clear();
        this.bipedHeadwear.cubeList.clear();
        this.bipedBody.cubeList.clear();
        this.bipedRightArm.cubeList.clear();
        this.bipedLeftArm.cubeList.clear();
        this.bipedLeftLeg.cubeList.clear();
        this.bipedRightLeg.cubeList.clear();

        body.offsetY = 0.755F;
        rightArm.offsetY = 0.755F;
        leftArm.offsetY = 0.755F;

        head.offsetY = -0.07F;
        body.offsetY = 0.755F;
        body.offsetZ = -0.03F;
        rightArm.offsetY = 0.72F;
        rightArm.offsetX = -0.21F; //rightArm.offsetX = -0.18F;
        rightArm.offsetZ = 0.F;
        leftArm.offsetY = 0.72F;
        leftArm.offsetX = 0.21F; //leftArm.offsetX = 0.18F;
        leftArm.offsetZ = 0F;
        belt.offsetY = 0.756F;
        belt.offsetZ = -0.04F;
        rightLeg.offsetY = 0.6F;
        rightLeg.offsetX = -0.085F; //rightLeg.offsetX = -0.06F;
        leftLeg.offsetY = 0.6F;
        leftLeg.offsetX = 0.085F; //leftLeg.offsetX = 0.06F;
        rightBoot.offsetY = 0.76F;
        rightBoot.offsetX = -0.03F;
        leftBoot.offsetY = 0.76F;
        leftBoot.offsetX = 0.03F;

        leftLeg.scale = 1F / 14F;
        rightLeg.scale = 1F / 14F;
        leftBoot.scale = 1F / 14F;
        rightBoot.scale = 1F / 14F;

        leftArm.scale = 1F / 13.7F;
        rightArm.scale = 1F / 13.7F;

        if (isHelmet) {
            this.bipedHead.addChild(head);
        }
        if (isChestPiece) {
            this.bipedBody.addChild(body);
            this.bipedLeftArm.addChild(leftArm);
            this.bipedRightArm.addChild(rightArm);
        }
        if (isLeggings) {
            this.bipedLeftLeg.addChild(leftLeg);
            this.bipedRightLeg.addChild(rightLeg);
            this.bipedBody.addChild(belt);
        }
        if (isdBoots) {
            this.bipedLeftLeg.addChild(leftBoot);
            this.bipedRightLeg.addChild(rightBoot);
        }

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

        if (entity == null || entity instanceof EntityArmorStand) {
            isSneak = false;
            isRiding = false;
            isChild = false;
            //aimedBow = false;

            this.bipedRightArm.rotateAngleX = 0F;
            this.bipedRightArm.rotateAngleY = 0F;
            this.bipedRightArm.rotateAngleZ = 0F;
            this.bipedLeftArm.rotateAngleX = 0F;
            this.bipedLeftArm.rotateAngleY = 0F;
            this.bipedLeftArm.rotateAngleZ = 0F;

            bipedBody.rotateAngleX = 0F;
            bipedBody.rotateAngleY = 0F;
            bipedBody.rotateAngleZ = 0F;

            bipedHead.rotateAngleX = 0F;
            bipedHead.rotateAngleY = 0F;
            bipedHead.rotateAngleZ = 0F;

            bipedLeftLeg.rotateAngleX = 0F;
            bipedLeftLeg.rotateAngleY = 0F;
            bipedLeftLeg.rotateAngleZ = 0F;

            bipedRightLeg.rotateAngleX = 0F;
            bipedRightLeg.rotateAngleY = 0F;
            bipedRightLeg.rotateAngleZ = 0F;

            setRotationAngles(0, 0, 0, 0, 0, 0, null);
        } else {
            //super.render(entity, f, f1, f2, f3, f4, f5);
            super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        }

        GlStateManager.pushMatrix();

        if (entity.isSneaking())
        {
            GlStateManager.translate(0.0F, 0.2F, 0.0F);
        }

        this.bipedHead.render(1F / 13F);

 //       GlStateManager.pushMatrix();
//
//        if (entity.isSneaking() && )
//        {
//            GlStateManager.translate(0.0F, 0.2F, 0.0F);
//        }

        this.bipedRightArm.render(1F / 16F);
        this.bipedLeftArm.render(1F / 16F);
 //       GlStateManager.popMatrix();
        this.bipedBody.render(1F / 16F);
        this.bipedRightLeg.render(1F / 16F);
        this.bipedLeftLeg.render(1F / 16F);

//        this.bipedHead.render(1F / 13F);
//        this.bipedRightArm.render(1F / 15F);
//        this.bipedLeftArm.render(1F / 15F);
//        this.bipedBody.render(1F / 15F);
//        this.bipedRightLeg.render(1F / 16F);
//        this.bipedLeftLeg.render(1F / 16F);

        GlStateManager.popMatrix();

    }

    public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float scale, Entity p_78087_7_) {
        this.bipedRightArm.rotateAngleZ = 0.0F;
        this.bipedLeftArm.rotateAngleZ = 0.0F;
        this.bipedRightArm.rotationPointZ = 0.0F;
        this.bipedLeftArm.rotationPointZ = 0.0F;
        this.bipedRightLeg.rotateAngleY = 0.0F;
        this.bipedLeftLeg.rotateAngleY = 0.0F;
        this.bipedRightArm.rotateAngleY = 0.0F;
        this.bipedLeftArm.rotateAngleY = 0.0F;
        this.bipedBody.rotateAngleX = 0.0F;
        this.bipedRightLeg.rotationPointZ = 0.1F;
        this.bipedLeftLeg.rotationPointZ = 0.1F;
        this.bipedRightLeg.rotationPointY = 12.0F;
        this.bipedLeftLeg.rotationPointY = 12.0F;
        this.bipedHead.rotationPointY = 0.0F;
        this.bipedHeadwear.rotationPointY = 0.0F;
        this.leftLeg.rotationPointZ = 0F;
        this.rightLeg.rotationPointZ = 0F;
        this.bipedRightArm.rotateAngleZ = 0.0F;
        this.bipedLeftArm.rotateAngleZ = 0.0F;
    }
}
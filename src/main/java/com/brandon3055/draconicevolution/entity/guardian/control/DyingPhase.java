package com.brandon3055.draconicevolution.entity.guardian.control;

import com.brandon3055.draconicevolution.entity.guardian.DraconicGuardianEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.EndPodiumFeature;

import javax.annotation.Nullable;

@Deprecated //Old vanilla phase
public class DyingPhase extends Phase {
   private Vector3d targetLocation;
   private int time;

   public DyingPhase(DraconicGuardianEntity guardisn) {
      super(guardisn);
   }

   public void clientTick() {
      if (this.time++ % 10 == 0) {
         float f = (this.guardian.getRNG().nextFloat() - 0.5F) * 8.0F;
         float f1 = (this.guardian.getRNG().nextFloat() - 0.5F) * 4.0F;
         float f2 = (this.guardian.getRNG().nextFloat() - 0.5F) * 8.0F;
         this.guardian.world.addParticle(ParticleTypes.EXPLOSION_EMITTER, this.guardian.getPosX() + (double)f, this.guardian.getPosY() + 2.0D + (double)f1, this.guardian.getPosZ() + (double)f2, 0.0D, 0.0D, 0.0D);
      }

   }

   public void serverTick() {
      ++this.time;
      if (this.targetLocation == null) {
         BlockPos blockpos = this.guardian.world.getHeight(Heightmap.Type.MOTION_BLOCKING, EndPodiumFeature.END_PODIUM_LOCATION);
         this.targetLocation = Vector3d.copyCenteredHorizontally(blockpos);
      }

      double d0 = this.targetLocation.squareDistanceTo(this.guardian.getPosX(), this.guardian.getPosY(), this.guardian.getPosZ());
      if (!(d0 < 100.0D) && !(d0 > 22500.0D) && !this.guardian.collidedHorizontally && !this.guardian.collidedVertically) {
         this.guardian.setHealth(1.0F);
      } else {
         this.guardian.setHealth(0.0F);
      }

   }

   public void initPhase() {
      this.targetLocation = null;
      this.time = 0;
   }

   public float getMaxRiseOrFall() {
      return 3.0F;
   }

   @Nullable
   public Vector3d getTargetLocation() {
      return this.targetLocation;
   }

   public PhaseType<DyingPhase> getType() {
      return PhaseType.DYING;
   }
}

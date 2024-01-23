package oringo.mixin;

import net.minecraft.network.play.client.C0FPacketConfirmTransaction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({C0FPacketConfirmTransaction.class})
public interface C0FPacketConfirmTransactionAccessor {
   @Accessor
   void setAccepted(boolean var1);
}

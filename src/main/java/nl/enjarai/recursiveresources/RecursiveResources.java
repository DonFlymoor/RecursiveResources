package nl.enjarai.recursiveresources;

//import net.fabricmc.api.ClientModInitializer;
import net.minecraft.util.Identifier;
import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkConstants;

@Mod(RecursiveResources.MOD_ID)
public class RecursiveResources {
    public static final String MOD_ID = "recursiveresources";

    public RecursiveResources() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onInitializeClient);

        ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class, () -> new IExtensionPoint.DisplayTest(() -> NetworkConstants.IGNORESERVERONLY, (a, b) -> true));

    }

    public void onInitializeClient(final FMLClientSetupEvent event) {

    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}

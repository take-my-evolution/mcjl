
package mushishi;
import java.io.File;
import java.io.IOException;


public class javaStart {

    public static void main(String[] args) throws IOException {
        String javaPath = args[0];
        String memory = args[1];
        String user = args[2];
        String gameDir = new File(javaStart.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getParent();

        String command = javaPath + " -XX:HeapDumpPath=MojangTricksIntelDriversForPerformance_java.exe_minecraft.exe.heapdump -Dos.name=Windows 10 -Dos.version=10.0 -Xss1M -Djava.library.path="
                +gameDir+"\\natives_win\\ -Dminecraft.launcher.brand=minecraft-launcher -Dminecraft.launcher.version=2.12.17 -cp"
				+gameDir+ "\\libraries\\cpw\\mods\\securejarhandler\\1.0.8\\securejarhandler-1.0.8.jar;"
				+gameDir+ "\\libraries\\org\\ow2\\asm\\asm\\9.5\\asm-9.5.jar;"
				+gameDir+ "\\libraries\\org\\ow2\\asm\\asm-commons\\9.5\\asm-commons-9.5.jar;"
				+gameDir+ "\\ibraries\\org\\ow2\\asm\\asm-tree\\9.5\\asm-tree-9.5.jar;"
				+gameDir+ "\\libraries\\org\\ow2\\asm\\asm-util\\9.5\\asm-util-9.5.jar;"
				+gameDir+ "\\libraries\\org\\ow2\\asm\\asm-analysis\\9.5\\asm-analysis-9.5.jar;"
				+gameDir+ "\\libraries\\net\\minecraftforge\\accesstransformers\\8.0.4\\accesstransformers-8.0.4.jar;"
				+gameDir+ "\\libraries\\org\\antlr\\antlr4-runtime\\4.9.1\\antlr4-runtime-4.9.1.jar;"
				+gameDir+ "\\libraries\\net\\minecraftforge\\eventbus\\5.0.3\\eventbus-5.0.3.jar;"
				+gameDir+ "\\libraries\\net\\minecraftforge\\forgespi\\4.0.15-4.x\\forgespi-4.0.15-4.x.jar;"
				+gameDir+ "\\libraries\\net\\minecraftforge\\coremods\\5.0.1\\coremods-5.0.1.jar;"
				+gameDir+ "\\libraries\\cpw\\mods\\modlauncher\\9.1.3\\modlauncher-9.1.3.jar;"
				+gameDir+ "\\libraries\\net\\minecraftforge\\unsafe\\0.2.0\\unsafe-0.2.0.jar;"
				+gameDir+ "\\libraries\\com\\electronwill\\night-config\\core\\3.6.4\\core-3.6.4.jar;"
				+gameDir+ "\\libraries\\com\\electronwill\\night-config\\toml\\3.6.4\\toml-3.6.4.jar;"
				+gameDir+ "\\libraries\\org\\apache\\maven\\maven-artifact\\3.6.3\\maven-artifact-3.6.3.jar;"
				+gameDir+ "\\libraries\\net\\jodah\\typetools\\0.8.3\\typetools-0.8.3.jar;"
				+gameDir+ "\\libraries\\net\\minecrell\\terminalconsoleappender\\1.2.0\\terminalconsoleappender-1.2.0.jar;"
				+gameDir+ "\\libraries\\org\\jline\\jline-reader\\3.12.1\\jline-reader-3.12.1.jar;"
				+gameDir+ "\\libraries\\org\\jline\\jline-terminal\\3.12.1\\jline-terminal-3.12.1.jar;"
				+gameDir+ "\\libraries\\org\\spongepowered\\mixin\\0.8.5\\mixin-0.8.5.jar;"
				+gameDir+ "\\libraries\\org\\openjdk\\nashorn\\nashorn-core\\15.3\\nashorn-core-15.3.jar;"
				+gameDir+ "\\libraries\\net\\minecraftforge\\JarJarSelector\\0.3.19\\JarJarSelector-0.3.19.jar;"
				+gameDir+ "\\libraries\\net\\minecraftforge\\JarJarMetadata\\0.3.19\\JarJarMetadata-0.3.19.jar;"
				+gameDir+ "\\libraries\\cpw\\mods\\bootstraplauncher\\1.0.0\\bootstraplauncher-1.0.0.jar;"
				+gameDir+ "\\libraries\\net\\minecraftforge\\JarJarFileSystems\\0.3.19\\JarJarFileSystems-0.3.19.jar;"
				+gameDir+ "\\libraries\\net\\minecraftforge\\fmlloader\\1.18.2-40.2.13\\fmlloader-1.18.2-40.2.13.jar;"
				+gameDir+ "\\libraries\\com\\mojang\\logging\\1.0.0\\logging-1.0.0.jar;"
				+gameDir+ "\\libraries\\com\\mojang\\blocklist\\1.0.10\\blocklist-1.0.10.jar;"
				+gameDir+ "\\libraries\\com\\mojang\\patchy\\2.2.10\\patchy-2.2.10.jar;"
				+gameDir+ "\\libraries\\com\\github\\oshi\\oshi-core\\5.8.5\\oshi-core-5.8.5.jar;"
				+gameDir+ "\\libraries\\net\\java\\dev\\jna\\jna\\5.10.0\\jna-5.10.0.jar;"
				+gameDir+ "\\libraries\\net\\java\\dev\\jna\\jna-platform\\5.10.0\\jna-platform-5.10.0.jar;"
				+gameDir+ "\\libraries\\org\\slf4j\\slf4j-api\\1.8.0-beta4\\slf4j-api-1.8.0-beta4.jar;"
				+gameDir+ "\\libraries\\org\\apache\\logging\\log4j\\log4j-slf4j18-impl\\2.17.0\\log4j-slf4j18-impl-2.17.0.jar;"
				+gameDir+ "\\libraries\\com\\ibm\\icu\\icu4j\\70.1\\icu4j-70.1.jar;"
				+gameDir+ "\\libraries\\com\\mojang\\javabridge\\1.2.24\\javabridge-1.2.24.jar;"
				+gameDir+ "\\libraries\\net\\sf\\jopt-simple\\jopt-simple\\5.0.4\\jopt-simple-5.0.4.jar;"
				+gameDir+ "\\libraries\\io\\netty\\netty-all\\4.1.68.Final\\netty-all-4.1.68.Final.jar;"
				+gameDir+ "\\libraries\\com\\google\\guava\\failureaccess\\1.0.1\\failureaccess-1.0.1.jar;"
				+gameDir+ "\\libraries\\com\\google\\guava\\guava\\31.0.1-jre\\guava-31.0.1-jre.jar;"
				+gameDir+ "\\libraries\\org\\apache\\commons\\commons-lang3\\3.12.0\\commons-lang3-3.12.0.jar;"
				+gameDir+ "\\libraries\\commons-io\\commons-io\\2.11.0\\commons-io-2.11.0.jar;"
				+gameDir+ "\\libraries\\commons-codec\\commons-codec\\1.15\\commons-codec-1.15.jar;"
				+gameDir+ "\\libraries\\com\\mojang\\brigadier\\1.0.18\\brigadier-1.0.18.jar;"
				+gameDir+ "\\libraries\\com\\mojang\\datafixerupper\\4.1.27\\datafixerupper-4.1.27.jar;"
				+gameDir+ "\\libraries\\com\\google\\code\\gson\\gson\\2.8.9\\gson-2.8.9.jar;"
				+gameDir+ "\\libraries\\com\\mojang\\authlib\\3.3.39\\authlib-3.3.39.jar;"
				+gameDir+ "\\libraries\\org\\apache\\commons\\commons-compress\\1.21\\commons-compress-1.21.jar;"
				+gameDir+ "\\libraries\\org\\apache\\httpcomponents\\httpclient\\4.5.13\\httpclient-4.5.13.jar;"
				+gameDir+ "\\libraries\\commons-logging\\commons-logging\\1.2\\commons-logging-1.2.jar;"
				+gameDir+ "\\libraries\\org\\apache\\httpcomponents\\httpcore\\4.4.14\\httpcore-4.4.14.jar;"
				+gameDir+ "\\libraries\\it\\unimi\\dsi\\fastutil\\8.5.6\\fastutil-8.5.6.jar;"
				+gameDir+ "\\libraries\\org\\apache\\logging\\log4j\\log4j-api\\2.17.0\\log4j-api-2.17.0.jar;"
				+gameDir+ "\\libraries\\org\\apache\\logging\\log4j\\log4j-core\\2.17.0\\log4j-core-2.17.0.jar;"
				+gameDir+ "\\libraries\\org\\lwjgl\\lwjgl\\3.2.2\\lwjgl-3.2.2.jar;"
				+gameDir+ "\\libraries\\org\\lwjgl\\lwjgl-jemalloc\\3.2.2\\lwjgl-jemalloc-3.2.2.jar;"
				+gameDir+ "\\libraries\\org\\lwjgl\\lwjgl-openal\\3.2.2\\lwjgl-openal-3.2.2.jar;"
				+gameDir+ "\\libraries\\org\\lwjgl\\lwjgl-opengl\\3.2.2\\lwjgl-opengl-3.2.2.jar;"
				+gameDir+ "\\libraries\\org\\lwjgl\\lwjgl-glfw\\3.2.2\\lwjgl-glfw-3.2.2.jar;"
				+gameDir+ "\\libraries\\org\\lwjgl\\lwjgl-stb\\3.2.2\\lwjgl-stb-3.2.2.jar;"
				+gameDir+ "\\libraries\\org\\lwjgl\\lwjgl-tinyfd\\3.2.2\\lwjgl-tinyfd-3.2.2.jar;"
				+gameDir+ "\\libraries\\com\\mojang\\text2speech\\1.12.4\\text2speech-1.12.4.jar;"
				+gameDir+ "versions\\1.18.2-forge-40.2.13\\1.18.2-forge-40.2.13.jar -Djava.net.preferIPv6Addresses=system -DignoreList=bootstraplauncher,securejarhandler,asm-commons,asm-util,asm-analysis,asm-tree,asm,JarJarFileSystems,client-extra,fmlcore,javafmllanguage,lowcodelanguage,mclanguage,forge-,1.18.2-forge-40.2.13.jar -DmergeModules=jna-5.10.0.jar,jna-platform-5.10.0.jar,java-objc-bridge-1.0.0.jar -DlibraryDirectory="
                +gameDir+ "\\libraries -p"
                +gameDir+ "\\libraries/cpw/mods/bootstraplauncher/1.0.0/bootstraplauncher-1.0.0.jar;"
                +gameDir+ "\\libraries/cpw/mods/securejarhandler/1.0.8/securejarhandler-1.0.8.jar;"
				+gameDir+ "\\libraries/org/ow2/asm/asm-commons/9.5/asm-commons-9.5.jar;"
				+gameDir+ "\\libraries/org/ow2/asm/asm-util/9.5/asm-util-9.5.jar;"
				+gameDir+ "\\libraries/org/ow2/asm/asm-analysis/9.5/asm-analysis-9.5.jar;"
				+gameDir+ "\\libraries/org/ow2/asm/asm-tree/9.5/asm-tree-9.5.jar;"
				+gameDir+ "\\libraries/org/ow2/asm/asm/9.5/asm-9.5.jar;"
				+gameDir+ "\\libraries/net/minecraftforge/JarJarFileSystems/0.3.19/JarJarFileSystems-0.3.19.jar"           
                + "--add-modules ALL-MODULE-PATH "
                + "--add-opens java.base/java.util.jar=cpw.mods.securejarhandler "
                + "--add-opens java.base/java.lang.invoke=cpw.mods.securejarhandler "
                + "--add-exports java.base/sun.security.util=cpw.mods.securejarhandler "
                + "--add-exports jdk.naming.dns/com.sun.jndi.dns=java.naming "
                + "-Xmx" + memory + " "
                + "-XX:+UnlockExperimentalVMOptions "
                + "-XX:+UseG1GC "
                + "-XX:G1NewSizePercent=20 "
                + "-XX:G1ReservePercent=20 "
                + "-XX:MaxGCPauseMillis=50 "
                + "-XX:G1HeapRegionSize=32M "
                + "cpw.mods.bootstraplauncher.BootstrapLauncher "
                + "--username " + user + " "
                + "--version 1.18.2-forge-40.2.13 "
                + "--gameDir " + gameDir + " "
                + "--assetsDir %~dp0assets "
                + "--assetIndex 1.18 "
                + "--accessToken 0000 "
                + "--versionType release "
                + "--launchTarget forgeclient "
                + "--fml.forgeVersion 40.2.13 "
                + "--fml.mcVersion 1.18.2 "
                + "--fml.forgeGroup net.minecraftforge "
                + "--fml.mcpVersion 20220404.173914";

        Process process = Runtime.getRuntime().exec(command);

        // Дополнительный код для обработки вывода и ошибок процесса, если необходимо

        // Ждем, пока процесс не завершится
        try {
            int exitCode = process.waitFor();
            System.out.println("Процесс завершился с кодом: " + exitCode);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
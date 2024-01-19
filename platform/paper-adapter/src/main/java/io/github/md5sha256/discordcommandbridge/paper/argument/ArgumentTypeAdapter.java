package io.github.md5sha256.discordcommandbridge.paper.argument;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.tree.CommandNode;
import io.github.md5sha256.discordcommandbridge.function.FunctionParameter;

@FunctionalInterface
public interface ArgumentTypeAdapter<T extends ArgumentType<V>, V> {
    FunctionParameter adaptArgumentType(T argumentType, CommandNode<?> node);

}

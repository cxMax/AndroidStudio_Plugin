package com.cxmax.plugin.codegenerator;

import com.intellij.icons.AllIcons;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ItemFileType extends LanguageFileType {

    protected ItemFileType(@NotNull Language language) {
        super(language);
    }

    @NotNull
    @Override
    public String getName() {
        return "Item";
    }

    @NotNull
    @Override
    public String getDescription() {
        return null;
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "java";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return AllIcons.FileTypes.JavaClass;
    }
}

package com.github.catvod.spider.merge.D;

import android.app.AppOpsManager;
import android.hardware.ConsumerIrManager;
import android.print.PrintManager;
import android.transition.Transition;
import android.view.accessibility.CaptioningManager;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ Class A() {
        return PrintManager.class;
    }

    public static /* bridge */ /* synthetic */ AppOpsManager c(Object obj) {
        return (AppOpsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Transition g(Object obj) {
        return (Transition) obj;
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return AppOpsManager.class;
    }

    public static /* bridge */ /* synthetic */ Class t() {
        return CaptioningManager.class;
    }

    public static /* bridge */ /* synthetic */ Class x() {
        return ConsumerIrManager.class;
    }
}
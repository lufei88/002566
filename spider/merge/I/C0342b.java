package com.github.catvod.spider.merge.i;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.Consumer;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;

/* renamed from: com.github.catvod.spider.merge.i.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0342b implements Consumer {
    public final /* synthetic */ int a;

    /* renamed from: ۟ۥۢۦۥ, reason: not valid java name and contains not printable characters */
    public static void m8677(Object obj) {
        if (C0000.m1116() < 0) {
            IntentSanitizer.a((String) obj);
        }
    }

    /* renamed from: ۤ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static void m8678(Object obj) {
        if (C0008.m1975() > 0) {
            IntentSanitizer.b((String) obj);
        }
    }

    public final void accept(Object obj) {
        String str = (String) obj;
        switch (C0020.m4280(this)) {
            case 0:
                m8677(str);
                break;
            default:
                m8678(str);
                break;
        }
    }
}
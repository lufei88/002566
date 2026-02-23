package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import java.util.ArrayList;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0123f extends N {
    int b = 0;
    final ArrayList<N> a = new ArrayList<>();

    AbstractC0123f() {
    }

    /* renamed from: ۟ۥۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static ArrayList m2699(Object obj) {
        if (C0048.m7971() > 0) {
            return ((AbstractC0123f) obj).a;
        }
        return null;
    }

    final void b() {
        this.b = C0009.m2139(m2699(this));
    }
}
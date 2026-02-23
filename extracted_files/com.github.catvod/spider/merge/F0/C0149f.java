package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.p000mergexbpq.a0.C0006;

/* renamed from: com.github.catvod.spider.merge.F0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149f {
    public final /* synthetic */ int a;

    public /* synthetic */ C0149f(int i) {
        this.a = i;
    }

    public final int a(char[] cArr, int i) {
        switch (C0006.m1795(this)) {
            case 0:
                return cArr[i];
            default:
                return (cArr[i + 1] << 16) | cArr[i];
        }
    }

    public final int b() {
        switch (C0006.m1795(this)) {
            case 0:
                return 1;
            default:
                return 2;
        }
    }
}
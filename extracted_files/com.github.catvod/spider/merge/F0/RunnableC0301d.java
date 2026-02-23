package com.github.catvod.spider.merge.f0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.h.C0054;

/* renamed from: com.github.catvod.spider.merge.f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0301d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0301d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0054.m8624(this)) {
            case 0:
                C0047.m7777((C0302e) C0031.m5604(this));
                C0054.m8583();
                break;
            default:
                C0018.m3901((C0304g) C0031.m5604(this));
                break;
        }
    }
}
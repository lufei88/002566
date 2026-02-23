package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.S.C0005;

/* renamed from: com.github.catvod.spider.merge.P0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172d extends h {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0172d(int i) {
        super(1);
        this.b = i;
        switch (i) {
            case 1:
                super(2);
                break;
            case 2:
                super(7);
                break;
            case 3:
                super(11);
                break;
            case 4:
                super(10);
                break;
            default:
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.P0.h
    public final int c(n nVar, int i) {
        switch (C0059.m9190(this)) {
            case 0:
                if (i >= 100) {
                    return i;
                }
                int iM8344 = C0052.m8344(nVar) + i;
                if (i < C0005.m1616(nVar)) {
                    iM8344 += 100;
                }
                return iM8344;
            case 1:
                return i - 1;
            case 2:
                if (i == 7) {
                    return 1;
                }
                return 1 + i;
            case 3:
                if (i == 24) {
                    return 0;
                }
                return i;
            default:
                if (i == 12) {
                    return 0;
                }
                return i;
        }
    }
}
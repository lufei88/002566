package com.github.catvod.spider.merge.f;

import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.k;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.github.catvod.spider.merge.f.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293d extends k {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public C0293d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // com.github.catvod.spider.merge.a1.k
    public final boolean a(AbstractC0296g abstractC0296g, C0292c c0292c, C0292c c0292c2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterM9177;
        do {
            atomicReferenceFieldUpdaterM9177 = C0059.m9177(this);
            if (C0010.m2386(atomicReferenceFieldUpdaterM9177, abstractC0296g, c0292c, c0292c2)) {
                return true;
            }
        } while (C0014.m3301(atomicReferenceFieldUpdaterM9177, abstractC0296g) == c0292c);
        return false;
    }

    @Override // com.github.catvod.spider.merge.a1.k
    public final boolean b(AbstractC0296g abstractC0296g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterM8601;
        do {
            atomicReferenceFieldUpdaterM8601 = C0054.m8601(this);
            if (C0010.m2386(atomicReferenceFieldUpdaterM8601, abstractC0296g, obj, obj2)) {
                return true;
            }
        } while (C0014.m3301(atomicReferenceFieldUpdaterM8601, abstractC0296g) == obj);
        return false;
    }

    @Override // com.github.catvod.spider.merge.a1.k
    public final boolean c(AbstractC0296g abstractC0296g, C0295f c0295f, C0295f c0295f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterM5845;
        do {
            atomicReferenceFieldUpdaterM5845 = C0033.m5845(this);
            if (C0010.m2386(atomicReferenceFieldUpdaterM5845, abstractC0296g, c0295f, c0295f2)) {
                return true;
            }
        } while (C0014.m3301(atomicReferenceFieldUpdaterM5845, abstractC0296g) == c0295f);
        return false;
    }

    @Override // com.github.catvod.spider.merge.a1.k
    public final void d(C0295f c0295f, C0295f c0295f2) {
        C0042.m7158(C0041.m6768(this), c0295f, c0295f2);
    }

    @Override // com.github.catvod.spider.merge.a1.k
    public final void e(C0295f c0295f, Thread thread) {
        C0042.m7158(C0045.m7631(this), c0295f, thread);
    }
}
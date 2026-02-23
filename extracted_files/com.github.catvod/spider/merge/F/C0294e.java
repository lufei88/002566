package com.github.catvod.spider.merge.f;

import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.k;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* renamed from: com.github.catvod.spider.merge.f.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294e extends k {
    @Override // com.github.catvod.spider.merge.a1.k
    public final boolean a(AbstractC0296g abstractC0296g, C0292c c0292c, C0292c c0292c2) {
        synchronized (abstractC0296g) {
            try {
                if (C0014.m3318(abstractC0296g) != c0292c) {
                    return false;
                }
                abstractC0296g.b = c0292c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.github.catvod.spider.merge.a1.k
    public final boolean b(AbstractC0296g abstractC0296g, Object obj, Object obj2) {
        synchronized (abstractC0296g) {
            try {
                if (C0004.m1550(abstractC0296g) != obj) {
                    return false;
                }
                abstractC0296g.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.github.catvod.spider.merge.a1.k
    public final boolean c(AbstractC0296g abstractC0296g, C0295f c0295f, C0295f c0295f2) {
        synchronized (abstractC0296g) {
            try {
                if (C0042.m7108(abstractC0296g) != c0295f) {
                    return false;
                }
                abstractC0296g.c = c0295f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.github.catvod.spider.merge.a1.k
    public final void d(C0295f c0295f, C0295f c0295f2) {
        c0295f.b = c0295f2;
    }

    @Override // com.github.catvod.spider.merge.a1.k
    public final void e(C0295f c0295f, Thread thread) {
        c0295f.a = thread;
    }
}
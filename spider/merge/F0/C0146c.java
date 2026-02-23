package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.i.C0012;

/* renamed from: com.github.catvod.spider.merge.F0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146c extends com.github.catvod.spider.merge.Z0.a {
    public static final C0146c a = new C0146c();

    @Override // com.github.catvod.spider.merge.Z0.a
    public final boolean a(Object obj, Object obj2) {
        C0145b c0145b = (C0145b) obj;
        C0145b c0145b2 = (C0145b) obj2;
        if (c0145b == c0145b2) {
            return true;
        }
        return c0145b != null && c0145b2 != null && C0055.m8704(C0047.m7799(c0145b)) == C0055.m8704(C0047.m7799(c0145b2)) && C0012.m3044(c0145b) == C0012.m3044(c0145b2) && C0058.m9103(C0048.m7921(c0145b), C0048.m7921(c0145b2));
    }

    @Override // com.github.catvod.spider.merge.Z0.a
    public final int b(Object obj) {
        C0145b c0145b = (C0145b) obj;
        return C0050.m8087(C0048.m7921(c0145b)) + ((((217 + C0055.m8704(C0047.m7799(c0145b))) * 31) + C0012.m3044(c0145b)) * 31);
    }
}
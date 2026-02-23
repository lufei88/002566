package com.github.catvod.spider.merge.t0;

import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.r0.InterfaceC0364a;
import com.github.catvod.spider.merge.r0.InterfaceC0365b;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.j.C0013;

/* renamed from: com.github.catvod.spider.merge.t0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0372e extends AbstractC0368a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f860short = {2230, 2202, 2183, 2202, 2176, 2177, 2204, 2203, 2192, 2182, 2261, 2178, 2204, 2177, 2205, 2261, 2183, 2192, 2182, 2177, 2183, 2204, 2198, 2177, 2192, 2193, 2261, 2182, 2176, 2182, 2181, 2192, 2203, 2182, 2204, 2202, 2203, 2261, 2200, 2176, 2182, 2177, 2261, 2205, 2196, 2179, 2192, 2261, 2224, 2200, 2181, 2177, 2188, 2230, 2202, 2183, 2202, 2176, 2177, 2204, 2203, 2192, 2230, 2202, 2203, 2177, 2192, 2189, 2177};

    public AbstractC0372e(InterfaceC0364a interfaceC0364a) {
        super(interfaceC0364a);
        if (interfaceC0364a != null && C0002.m1299(interfaceC0364a) != C0004.m1517()) {
            throw new IllegalArgumentException(C0037.m6312(C0013.m3106(m9364(), 0, 69, 2293)));
        }
    }

    /* renamed from: ۟ۥۡۥۦ, reason: not valid java name and contains not printable characters */
    public static short[] m9364() {
        if (C0038.m6471() > 0) {
            return f860short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.r0.InterfaceC0364a
    public InterfaceC0365b getContext() {
        return C0004.m1517();
    }
}
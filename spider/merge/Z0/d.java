package com.github.catvod.spider.merge.Z0;

import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f695short = {3265, 3272, 3257};

    public static String a(String str) {
        try {
            return C0023.m4570(C0035.m6159(C0015.m3410(C0065.m9775(m6687(), 0, 3, 3212)), str == null ? null : C0012.m3018(str, C0034.m5989())));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: ۟ۧۢۦ, reason: not valid java name and contains not printable characters */
    public static short[] m6687() {
        if (C0063.m9589() < 0) {
            return f695short;
        }
        return null;
    }
}
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import java.io.File;
import java.text.SimpleDateFormat;

/* loaded from: classes.dex */
public abstract class f {
    public static final /* synthetic */ int a = 0;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f796short = {2871, 2871, 2871, 2871, 2915, 2819, 2819, 2915, 2858, 2858, 2824, 2825, 2896, 2886, 2903, 2889};

    static {
        new SimpleDateFormat(C0033.m5852(m8527(), 0, 10, 2894), C0025.m4785());
    }

    public static void a() {
        try {
            File file = new File(C0003.m1375(C0022.m4453()), C0035.m6131(m8527(), 10, 6, 2855));
            if (C0033.m5816(file)) {
                return;
            }
            C0058.m9160(file, C0009.m2099());
        } catch (Exception unused) {
        }
    }

    /* renamed from: ۣ۟ۧۢۧ, reason: not valid java name and contains not printable characters */
    public static short[] m8527() {
        if (C0041.m6823() <= 0) {
            return f796short;
        }
        return null;
    }
}
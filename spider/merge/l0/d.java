package com.github.catvod.spider.merge.l0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f831short = {2571, 2596, 2603, 2602, 2573, 2609, 2609, 2613, 2593, 2661, 2583, 2592, 2612, 2608, 2592, 2614, 2609, 2661, 2581, 2615, 2602, 2598, 2592, 2614, 2614, 2602, 2615, 2661, 2669, 2662, 1020};
    public long a;
    public final List b = C0044.m7507(new ArrayList());

    /* renamed from: ۟ۦۣۧۧ, reason: not valid java name and contains not printable characters */
    public static short[] m8844() {
        if (C0025.m4797() >= 0) {
            return f831short;
        }
        return null;
    }

    public final void a(a aVar) {
        this.a = C0045.m7607(this) + 1;
        Thread thread = new Thread(aVar);
        C0005.m1626(thread, true);
        StringBuilder sb = new StringBuilder(C0025.m4795(m8844(), 0, 30, 2629));
        C0058.m9141(sb, C0045.m7607(this));
        C0018.m3933(sb, C0019.m4107(m8844(), 30, 1, 981));
        C0025.m4816(thread, C0047.m7763(sb));
        C0063.m9550(C0018.m3943(this), aVar);
        C0024.m4682(thread);
    }
}
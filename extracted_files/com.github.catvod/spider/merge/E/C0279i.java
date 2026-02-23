package com.github.catvod.spider.merge.e;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: com.github.catvod.spider.merge.e.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279i implements Iterator, Map.Entry {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f776short = {2911, 2915, 2914, 2936, 2859, 2920, 2916, 2917, 2943, 2922, 2914, 2917, 2926, 2937, 2859, 2927, 2916, 2926, 2936, 2859, 2917, 2916, 2943, 2859, 2936, 2942, 2939, 2939, 2916, 2937, 2943, 2859, 2937, 2926, 2943, 2922, 2914, 2917, 2914, 2917, 2924, 2859, 2886, 2922, 2939, 2853, 2894, 2917, 2943, 2937, 2930, 2859, 2916, 2921, 2913, 2926, 2920, 2943, 2936, 2229, 2185, 2184, 2194, 2241, 2178, 2190, 2191, 2197, 2176, 2184, 2191, 2180, 2195, 2241, 2181, 2190, 2180, 2194, 2241, 2191, 2190, 2197, 2241, 2194, 2196, 2193, 2193, 2190, 2195, 2197, 2241, 2195, 2180, 2197, 2176, 2184, 2191, 2184, 2191, 2182, 2241, 2220, 2176, 2193, 2255, 2212, 2191, 2197, 2195, 2200, 2241, 2190, 2179, 2187, 2180, 2178, 2197, 2194, 2180, 2232, 2233, 2211, 2288, 2227, 2239, 2238, 2212, 2225, 2233, 2238, 2229, 2210, 2288, 2228, 2239, 2229, 2211, 2288, 2238, 2239, 2212, 2288, 2211, 2213, 2208, 2208, 2239, 2210, 2212, 2288, 2210, 2229, 2212, 2225, 2233, 2238, 2233, 2238, 2231, 2288, 2205, 2225, 2208, 2302, 2197, 2238, 2212, 2210, 2217, 2288, 2239, 2226, 2234, 2229, 2227, 2212, 2211, 2660, 2648, 2649, 2627, 2576, 2643, 2655, 2654, 2628, 2641, 2649, 2654, 2645, 2626, 2576, 2644, 2655, 2645, 2627, 2576, 2654, 2655, 2628, 2576, 2627, 2629, 2624, 2624, 2655, 2626, 2628, 2576, 2626, 2645, 2628, 2641, 2649, 2654, 2649, 2654, 2647, 2576, 2685, 2641, 2624, 2590, 2677, 2654, 2628, 2626, 2633, 2576, 2655, 2642, 2650, 2645, 2643, 2628, 2627, 923, 935, 934, 956, 1007, 940, 928, 929, 955, 942, 934, 929, 938, 957, 1007, 939, 928, 938, 956, 1007, 929, 928, 955, 1007, 956, 954, 959, 959, 928, 957, 955, 1007, 957, 938, 955, 942, 934, 929, 934, 929, 936, 1007, 898, 942, 959, 993, 906, 929, 955, 957, 950, 1007, 928, 941, 933, 938, 940, 955, 956, 351};
    public int a;
    public final /* synthetic */ C0271a d;
    public boolean c = false;
    public int b = -1;

    public C0279i(C0271a c0271a) {
        this.d = c0271a;
        this.a = C0022.m4406(c0271a) - 1;
    }

    /* renamed from: ۟ۤ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static short[] m8168() {
        if (C0003.m1463() < 0) {
            return f776short;
        }
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!C0038.m6474(this)) {
            throw new IllegalStateException(C0025.m4795(m8168(), 0, 59, 2827));
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object objM7624 = C0045.m7624(entry);
        int iM4747 = C0024.m4747(this);
        C0271a c0271aM8203 = C0051.m8203(this);
        Object objM6793 = C0041.m6793(c0271aM8203, iM4747, 0);
        if (objM7624 != objM6793 && (objM7624 == null || !C0058.m9103(objM7624, objM6793))) {
            return false;
        }
        Object objM6540 = C0039.m6540(entry);
        Object objM67932 = C0041.m6793(c0271aM8203, C0024.m4747(this), 1);
        return objM6540 == objM67932 || (objM6540 != null && C0058.m9103(objM6540, objM67932));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!C0038.m6474(this)) {
            throw new IllegalStateException(C0043.m7290(m8168(), 59, 59, 2273));
        }
        return C0041.m6793(C0051.m8203(this), C0024.m4747(this), 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!C0038.m6474(this)) {
            throw new IllegalStateException(C0051.m8259(m8168(), 118, 59, 2256));
        }
        return C0041.m6793(C0051.m8203(this), C0024.m4747(this), 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C0024.m4747(this) < C0006.m1780(this);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!C0038.m6474(this)) {
            throw new IllegalStateException(C0027.m5062(m8168(), 177, 59, 2608));
        }
        int iM4747 = C0024.m4747(this);
        C0271a c0271aM8203 = C0051.m8203(this);
        Object objM6793 = C0041.m6793(c0271aM8203, iM4747, 0);
        Object objM67932 = C0041.m6793(c0271aM8203, C0024.m4747(this), 1);
        return (objM6793 == null ? 0 : C0050.m8087(objM6793)) ^ (objM67932 != null ? C0050.m8087(objM67932) : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!C0002.m1261(this)) {
            throw new NoSuchElementException();
        }
        this.b = C0024.m4747(this) + 1;
        this.c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!C0038.m6474(this)) {
            throw new IllegalStateException();
        }
        C0047.m7836(C0051.m8203(this), C0024.m4747(this));
        this.b = C0024.m4747(this) - 1;
        this.a = C0006.m1780(this) - 1;
        this.c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (C0038.m6474(this)) {
            return C0003.m1356(C0051.m8203(this), C0024.m4747(this), obj);
        }
        throw new IllegalStateException(C0046.m7718(m8168(), 236, 59, 975));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C0016.m3605(sb, C0009.m2088(this));
        C0018.m3933(sb, C0010.m2300(m8168(), 295, 1, 354));
        C0016.m3605(sb, C0026.m4917(this));
        return C0047.m7763(sb);
    }
}
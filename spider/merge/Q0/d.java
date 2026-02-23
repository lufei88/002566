package com.github.catvod.spider.merge.q0;

import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d implements Map, Serializable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f850short = {2873, 2822, 2835, 2820, 2839, 2818, 2847, 2841, 2840, 2902, 2847, 2821, 2902, 2840, 2841, 2818, 2902, 2821, 2819, 2822, 2822, 2841, 2820, 2818, 2835, 2834, 2902, 2832, 2841, 2820, 2902, 2820, 2835, 2839, 2834, 2907, 2841, 2840, 2842, 2831, 2902, 2837, 2841, 2842, 2842, 2835, 2837, 2818, 2847, 2841, 2840, 1184, 1207, 1210, 1187, 1203, 2012, 2019, 2038, 2017, 2034, 2023, 2042, 2044, 2045, 1971, 2042, 2016, 1971, 2045, 2044, 2023, 1971, 2016, 2022, 2019, 2019, 2044, 2017, 2023, 2038, 2039, 1971, 2037, 2044, 2017, 1971, 2017, 2038, 2034, 2039, 1982, 2044, 2045, 2047, 2026, 1971, 2032, 2044, 2047, 2047, 2038, 2032, 2023, 2042, 2044, 2045, 439, 392, 413, 394, 409, 396, 401, 407, 406, 472, 401, 395, 472, 406, 407, 396, 472, 395, 397, 392, 392, 407, 394, 396, 413, 412, 472, 414, 407, 394, 472, 394, 413, 409, 412, 469, 407, 406, 404, 385, 472, 411, 407, 404, 404, 413, 411, 396, 401, 407, 406, 2634, 2677, 2656, 2679, 2660, 2673, 2668, 2666, 2667, 2597, 2668, 2678, 2597, 2667, 2666, 2673, 2597, 2678, 2672, 2677, 2677, 2666, 2679, 2673, 2656, 2657, 2597, 2659, 2666, 2679, 2597, 2679, 2656, 2660, 2657, 2600, 2666, 2667, 2665, 2684, 2597, 2662, 2666, 2665, 2665, 2656, 2662, 2673, 2668, 2666, 2667, 1257, 1263};
    public static final d a = new d();

    /* renamed from: ۤ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static short[] m9168() {
        if (C0038.m6471() > 0) {
            return f850short;
        }
        return null;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException(C0043.m7290(m9168(), 0, 51, 2934));
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        C0057.m8982((Void) obj, C0003.m1398(m9168(), 51, 5, 1238));
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return C0008.m2024();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return (obj instanceof Map) && C0012.m2970((Map) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return C0008.m2024();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException(C0043.m7290(m9168(), 56, 51, 1939));
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException(C0046.m7718(m9168(), 107, 51, 504));
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException(C0065.m9775(m9168(), 158, 51, 2565));
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return C0060.m9352(m9168(), 209, 2, 1170);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return C0022.m4489();
    }
}
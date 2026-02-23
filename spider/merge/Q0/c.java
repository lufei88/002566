package com.github.catvod.spider.merge.q0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c implements List, Serializable, RandomAccess {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f849short = {2881, 2942, 2923, 2940, 2927, 2938, 2919, 2913, 2912, 2862, 2919, 2941, 2862, 2912, 2913, 2938, 2862, 2941, 2939, 2942, 2942, 2913, 2940, 2938, 2923, 2922, 2862, 2920, 2913, 2940, 2862, 2940, 2923, 2927, 2922, 2851, 2913, 2912, 2914, 2935, 2862, 2925, 2913, 2914, 2914, 2923, 2925, 2938, 2919, 2913, 2912, 2627, 2684, 2665, 2686, 2669, 2680, 2661, 2659, 2658, 2604, 2661, 2687, 2604, 2658, 2659, 2680, 2604, 2687, 2681, 2684, 2684, 2659, 2686, 2680, 2665, 2664, 2604, 2666, 2659, 2686, 2604, 2686, 2665, 2669, 2664, 2593, 2659, 2658, 2656, 2677, 2604, 2671, 2659, 2656, 2656, 2665, 2671, 2680, 2661, 2659, 2658, 277, 298, 319, 296, 315, 302, 307, 309, 308, 378, 307, 297, 378, 308, 309, 302, 378, 297, 303, 298, 298, 309, 296, 302, 319, 318, 378, 316, 309, 296, 378, 296, 319, 315, 318, 375, 309, 308, 310, 291, 378, 313, 309, 310, 310, 319, 313, 302, 307, 309, 308, 855, 872, 893, 874, 889, 876, 881, 887, 886, 824, 881, 875, 824, 886, 887, 876, 824, 875, 877, 872, 872, 887, 874, 876, 893, 892, 824, 894, 887, 874, 824, 874, 893, 889, 892, 821, 887, 886, 884, 865, 824, 891, 887, 884, 884, 893, 891, 876, 881, 887, 886, 2119, 2168, 2157, 2170, 2153, 2172, 2145, 2151, 2150, 2088, 2145, 2171, 2088, 2150, 2151, 2172, 2088, 2171, 2173, 2168, 2168, 2151, 2170, 2172, 2157, 2156, 2088, 2158, 2151, 2170, 2088, 2170, 2157, 2153, 2156, 2085, 2151, 2150, 2148, 2161, 2088, 2155, 2151, 2148, 2148, 2157, 2155, 2172, 2145, 2151, 2150, 1273, 1264, 1273, 1265, 1273, 1266, 1256, 3315, 3322, 3315, 3323, 3315, 3320, 3298, 3301, 1188, 1164, 1169, 1173, 1176, 1217, 1165, 1160, 1170, 1173, 1217, 1157, 1166, 1156, 1170, 1167, 1222, 1173, 1217, 1154, 1166, 1167, 1173, 1152, 1160, 1167, 1217, 1156, 1165, 1156, 1164, 1156, 1167, 1173, 1217, 1152, 1173, 1217, 1160, 1167, 1157, 1156, 1177, 1217, 2890, 2883, 2890, 2882, 2890, 2881, 2907, 1101, 1092, 1101, 1093, 1101, 1094, 1116, 2940, 2907, 2897, 2896, 2893, 2831, 2837, 1714, 1677, 1688, 1679, 1692, 1673, 1684, 1682, 1683, 1757, 1684, 1678, 1757, 1683, 1682, 1673, 1757, 1678, 1672, 1677, 1677, 1682, 1679, 1673, 1688, 1689, 1757, 1691, 1682, 1679, 1757, 1679, 1688, 1692, 1689, 1744, 1682, 1683, 1681, 1668, 1757, 1694, 1682, 1681, 1681, 1688, 1694, 1673, 1684, 1682, 1683, 598, 617, 636, 619, 632, 621, 624, 630, 631, 569, 624, 618, 569, 631, 630, 621, 569, 618, 620, 617, 617, 630, 619, 621, 636, 637, 569, 639, 630, 619, 569, 619, 636, 632, 637, 564, 630, 631, 629, 608, 569, 634, 630, 629, 629, 636, 634, 621, 624, 630, 631, 3300, 3291, 3278, 3289, 3274, 3295, 3266, 3268, 3269, 3211, 3266, 3288, 3211, 3269, 3268, 3295, 3211, 3288, 3294, 3291, 3291, 3268, 3289, 3295, 3278, 3279, 3211, 3277, 3268, 3289, 3211, 3289, 3278, 3274, 3279, 3206, 3268, 3269, 3271, 3282, 3211, 3272, 3268, 3271, 3271, 3278, 3272, 3295, 3266, 3268, 3269, 504, 455, 466, 453, 470, 451, 478, 472, 473, 407, 478, 452, 407, 473, 472, 451, 407, 452, 450, 455, 455, 472, 453, 451, 466, 467, 407, 465, 472, 453, 407, 453, 466, 470, 467, 410, 472, 473, 475, 462, 407, 468, 472, 475, 475, 466, 468, 451, 478, 472, 473, 900, 955, 942, 953, 938, 959, 930, 932, 933, 1003, 930, 952, 1003, 933, 932, 959, 1003, 952, 958, 955, 955, 932, 953, 959, 942, 943, 1003, 941, 932, 953, 1003, 953, 942, 938, 943, 998, 932, 933, 935, 946, 1003, 936, 932, 935, 935, 942, 936, 959, 930, 932, 933, 1192, 1212, 1185, 1187, 1159, 1184, 1194, 1195, 1206, 1268, 1262, 2811, 2807, 2723, 2744, 2718, 2745, 2739, 2738, 2735, 2797, 2807, 2158, 2173, 2173, 2158, 2166, 2240, 2246};
    public static final c a = new c();

    /* renamed from: ۣۣ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static short[] m9167() {
        if (C0006.m1726() <= 0) {
            return f849short;
        }
        return null;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException(C0024.m4740(m9167(), 0, 51, 2830));
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException(C0037.m6307(m9167(), 51, 51, 2572));
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException(C0051.m8259(m9167(), 102, 51, 346));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException(C0041.m6779(m9167(), 153, 51, 792));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException(C0035.m6131(m9167(), 204, 51, 2056));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        C0057.m8982((Void) obj, C0010.m2300(m9167(), 255, 7, 1180));
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        C0057.m8982(collection, C0057.m8978(m9167(), 262, 8, 3222));
        return C0058.m9077(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof List) && C0035.m6132((List) obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        StringBuilder sb = new StringBuilder(C0027.m5062(m9167(), 270, 44, 1249));
        C0036.m6177(sb, i);
        C0062.m9399(sb, '.');
        throw new IndexOutOfBoundsException(C0047.m7763(sb));
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        C0057.m8982((Void) obj, C0063.m9585(m9167(), 314, 7, 2863));
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return C0025.m4834();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        C0057.m8982((Void) obj, C0018.m3917(m9167(), 321, 7, 1064));
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return C0025.m4834();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        if (i == 0) {
            return C0025.m4834();
        }
        throw new IndexOutOfBoundsException(C0040.m6632(i, C0012.m2973(m9167(), 328, 7, 2869)));
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException(C0020.m4199(m9167(), 335, 51, 1789));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException(C0034.m6001(m9167(), 386, 51, 537));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException(C0007.m1842(m9167(), 437, 51, 3243));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException(C0015.m3484(m9167(), 488, 51, 439));
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException(C0063.m9585(m9167(), 539, 51, 971));
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder(C0018.m3917(m9167(), 590, 11, 1230));
        C0036.m6177(sb, i);
        C0018.m3933(sb, C0044.m7509(m9167(), 601, 11, 2775));
        C0036.m6177(sb, i2);
        throw new IndexOutOfBoundsException(C0047.m7763(sb));
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C0063.m9591(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0057.m8982(objArr, C0012.m2973(m9167(), 612, 5, 2063));
        return C0037.m6320(this, objArr);
    }

    public final String toString() {
        return C0055.m8814(m9167(), 617, 2, 2203);
    }
}
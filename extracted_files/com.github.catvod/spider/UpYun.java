package com.github.catvod.spider;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class UpYun extends Ali {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f111short = {313, 293, 293, 289, 290, 363, 382, 382, 292, 289, 304, 289, 312, 383, 315, 292, 304, 289, 289, 360, 383, 306, 318, 316, 382, 290, 308, 304, 291, 306, 313, 366, 314, 308, 296, 294, 318, 291, 309, 364, 1664, 1750, 1735, 1729, 1731, 1691, 2719, 2762, 2790, 2765, 2752, 2761, 2780, 2692, 2699, 436, 402, 388, 403, 460, 416, 390, 388, 399, 405, 3129, 3099, 3086, 3101, 3096, 3096, 3093, 3163, 3137, 3162, 3140, 3156, 3164, 3107, 3101, 3098, 3088, 3099, 3075, 3079, 3156, 3130, 3104, 3156, 3141, 3140, 3162, 3140, 3151, 3156, 3107, 3101, 3098, 3138, 3136, 3151, 3156, 3084, 3138, 3136, 3165, 3156, 3125, 3076, 3076, 3096, 3089, 3107, 3089, 3094, 3135, 3101, 3072, 3163, 3137, 3143, 3139, 3162, 3143, 3138, 3156, 3164, 3135, 3132, 3104, 3129, 3128, 3160, 3156, 3096, 3101, 3103, 3089, 3156, 3123, 3089, 3095, 3103, 3099, 3165, 3156, 3127, 3100, 3078, 3099, 3097, 3089, 3163, 3141, 3142, 3142, 3162, 3140, 3162, 3140, 3162, 3140, 3156, 3111, 3093, 3090, 3093, 3078, 3101, 3163, 3137, 3143, 3139, 3162, 3143, 3138, 2492, 2475, 2493, 2491, 2466, 2490, 603, 582, 599, 607, 577, 1041, 1024, 1030, 1028, 1086, 1044, 1043, 1037, 1237, 1224, 1237, 1229, 1220, 2071, 2064, 2061, 2075, 2060, 2058, 2081, 2058, 2071, 2067, 2075, 2801, 2797, 2797, 2793, 2794, 2723, 2742, 2742, 2793, 2800, 2810, 2743, 2800, 2804, 2814, 2813, 2811, 2743, 2810, 2807, 2742, 2800, 2797, 2812, 2804, 2742, 2735, 2732, 2734, 2735, 2734, 2730, 2720, 2720, 2810, 2733, 2732, 2721, 2721, 2732, 2730, 2808, 2812, 2815, 2815, 2721, 2808, 2735, 2808, 2729, 2743, 2798, 2812, 2811, 2793, 1272};

    public static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(C0050.m8131(m563(), 0, 40, 337));
        C0018.m3933(sb, C0056.m8909(str));
        C0018.m3933(sb, C0028.m5109(m563(), 40, 6, 1702));
        C0018.m3933(sb, str2);
        C0018.m3933(sb, C0060.m9352(m563(), 46, 9, 2745));
        String strM7763 = C0047.m7763(sb);
        HashMap map = new HashMap();
        C0053.m8424(map, C0035.m6131(m563(), 55, 10, 481), C0021.m4340(m563(), 65, 111, 3188));
        JSONArray jSONArrayM4333 = C0021.m4333(C0003.m1370(new JSONObject(new String(C0034.m5997(C0032.m5769(strM7763, map), 0))), C0052.m8337(m563(), 176, 6, 2510)), C0031.m5565(m563(), 182, 5, 562));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            String strM8200 = C0051.m8200(jSONObjectM3923, C0055.m8814(m563(), 187, 8, 1121));
            String strM82002 = C0051.m8200(jSONObjectM3923, C0056.m8911(m563(), 195, 5, 1185));
            String strM82003 = C0051.m8200(jSONObjectM3923, C0003.m1398(m563(), 200, 11, 2174));
            if (C0058.m9127(strM82002, str)) {
                C0055.m8732(strM8200, strM82002, C0053.m8477(m563(), 211, 55, 2713), strM82003, arrayList);
            }
        }
        return C0047.m7783(arrayList);
    }

    /* renamed from: ۧ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m563() {
        if (C0016.m3596() < 0) {
            return f111short;
        }
        return null;
    }

    public String searchContent(String str, boolean z) {
        return C0035.m6080(str, C0035.m6131(m563(), 266, 1, 1225));
    }

    public String searchContent(String str, boolean z, String str2) {
        return C0035.m6080(str, str2);
    }
}
package org.cv;

import boofcv.abst.feature.detdesc.DetectDescribePoint;
import boofcv.abst.feature.detect.extract.ConfigExtract;
import boofcv.abst.feature.detect.extract.NonMaxSuppression;
import boofcv.abst.feature.detect.interest.ConfigFastHessian;
import boofcv.abst.feature.orientation.OrientationIntegral;
import boofcv.alg.feature.describe.DescribePointSurf;
import boofcv.alg.feature.detect.interest.FastHessianFeatureDetector;
import boofcv.alg.transform.ii.GIntegralImageOps;
import boofcv.core.image.GeneralizedImageOps;
import boofcv.factory.feature.describe.FactoryDescribePointAlgs;
import boofcv.factory.feature.detdesc.FactoryDetectDescribe;
import boofcv.factory.feature.detect.extract.FactoryFeatureExtractor;
import boofcv.factory.feature.orientation.FactoryOrientationAlgs;
import boofcv.io.UtilIO;
import boofcv.io.image.UtilImageIO;
import boofcv.struct.BoofDefaults;
import boofcv.struct.feature.BrightFeature;
import boofcv.struct.feature.ScalePoint;
import boofcv.struct.image.GrayF32;
import boofcv.struct.image.ImageGray;

import java.util.ArrayList;
import java.util.List;

/**
 * Example of how to use SURF detector and descriptors in BoofCV.
 *
 * Implementation changed !
 *
 * @author Peter Abeles
 */
public class BoofCVSurf {
//    /**
//     * Use generalized interfaces for working with SURF.  This removes much of the drudgery, but also reduces flexibility
//     * and slightly increases memory and computational requirements.
//     *
//     * @param image Input image type. DOES NOT NEED TO BE GrayF32, GrayU8 works too
//     */
//    public static void easy(GrayF32 image) {
//
//        // create the detector and descriptors
//        DetectDescribePoint<GrayF32, BrightFeature> surf = FactoryDetectDescribe.
//                surfStable(new ConfigFastHessian(0, 2, 200, 2, 9, 4, 4), null, null, GrayF32.class);
//
//        // specify the image to process
//        surf.detect(image);
//
//        System.out.println("Found Features: " + surf.getNumberOfFeatures());
//        System.out.println("First descriptor's first value: " + surf.getDescription(0).value[0]);
//    }
//
//    /**
//     * Configured exactly the same as the easy example above, but require a lot more code and a more in depth
//     * understanding of how SURF works and is configured.  Instead of TupleDesc_F64, SurfFeature are computed in
//     * this case.  They are almost the same as TupleDesc_F64, but contain the Laplacian's sign which can be used
//     * to speed up association. That is an example of how using less generalized interfaces can improve performance.
//     *
//     * @param image Input image type. DOES NOT NEED TO BE GrayF32, GrayU8 works too
//     */
//    public static <II extends ImageGray> void harder(GrayF32 image) {
//        // SURF works off of integral images
//        Class<II> integralType = GIntegralImageOps.getIntegralType(GrayF32.class);
//
//        // define the feature detection algorithm
//        NonMaxSuppression extractor =
//                FactoryFeatureExtractor.nonmax(new ConfigExtract(2, 0, 5, true));
//        FastHessianFeatureDetector<II> detector =
//                new FastHessianFeatureDetector<II>(extractor, 200, 2, 9, 4, 4, 6);
//
//        // estimate orientation
//        OrientationIntegral<II> orientation =
//                FactoryOrientationAlgs.sliding_ii(null, integralType);
//
//        DescribePointSurf<II> descriptor = FactoryDescribePointAlgs.<II>surfStability(null, integralType);
//
//        // compute the integral image of 'image'
//        II integral = GeneralizedImageOps.createSingleBand(integralType, image.width, image.height);
//        GIntegralImageOps.transform(image, integral);
//
//        // detect fast hessian features
//        detector.detect(integral);
//        // tell algorithms which image to process
//        orientation.setImage(integral);
//        descriptor.setImage(integral);
//
//        List<ScalePoint> points = detector.getFoundPoints();
//
//        List<BrightFeature> descriptions = new ArrayList<BrightFeature>();
//
//        for (ScalePoint p : points) {
//            // estimate orientation
//            orientation.setObjectRadius(p.scale * BoofDefaults.SURF_SCALE_TO_RADIUS);
//            double angle = orientation.compute(p.x, p.y);
//
//            // extract the SURF description for this region
//            BrightFeature desc = descriptor.createDescription();
//            descriptor.describe(p.x, p.y, angle, p.scale, desc);
//
//            // save everything for processing later on
//            descriptions.add(desc);
//        }
//
//        System.out.println("Found Features: " + points.size());
//        System.out.println("First descriptor's first value: " + descriptions.get(0).value[0]);
//    }
//
//    public static void main(String args[]) {
//
//        GrayF32 image = UtilImageIO.loadImage(UtilIO.pathExample("huge_image.jpg"), GrayF32.class);
//
//        // run each example
//        BoofCVSurf.easy(image);
//        BoofCVSurf.harder(image);
//
//        System.out.println("Done!");
//
//    }


}
package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiPinAlt1: ImageVector
    get() {
        if (_SiPinAlt1 != null) {
            return _SiPinAlt1!!
        }
        _SiPinAlt1 = ImageVector.Builder(
            name = "Filled.SiPinAlt1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.368f, 3.36f)
                arcToRelative(7.904f, 7.904f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.24f, -0.027f)
                horizontalLineToRelative(0.002f)
                lineToRelative(0.015f, 0.015f)
                lineToRelative(0.001f, 0.002f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(3.142f, 3.16f, 3.15f, 8.226f, 0.038f, 11.355f)
                lineToRelative(-4.963f, 4.99f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.418f, 0f)
                lineToRelative(-4.962f, -4.99f)
                curveToRelative(-3.108f, -3.125f, -3.108f, -8.192f, 0f, -11.317f)
                close()
                moveTo(12f, 5.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.47f, 16.812f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.16f, -0.81f)
                curveToRelative(1.414f, 0.251f, 2.653f, 0.604f, 3.565f, 1.054f)
                curveToRelative(0.455f, 0.224f, 0.878f, 0.496f, 1.2f, 0.832f)
                curveToRelative(0.327f, 0.34f, 0.605f, 0.807f, 0.605f, 1.384f)
                curveToRelative(0f, 0.907f, -0.66f, 1.527f, -1.244f, 1.903f)
                curveToRelative(-0.628f, 0.405f, -1.47f, 0.732f, -2.422f, 0.991f)
                curveToRelative(-1.918f, 0.523f, -4.51f, 0.834f, -7.334f, 0.834f)
                reflectiveCurveToRelative(-5.416f, -0.311f, -7.334f, -0.834f)
                curveToRelative(-0.952f, -0.26f, -1.794f, -0.586f, -2.422f, -0.991f)
                curveTo(1.661f, 20.799f, 1f, 20.179f, 1f, 19.272f)
                curveToRelative(0f, -0.577f, 0.278f, -1.044f, 0.604f, -1.384f)
                curveToRelative(0.323f, -0.336f, 0.746f, -0.608f, 1.2f, -0.832f)
                curveToRelative(0.913f, -0.45f, 2.152f, -0.803f, 3.566f, -1.054f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.35f, 1.969f)
                curveToRelative(-1.322f, 0.235f, -2.356f, 0.546f, -3.032f, 0.879f)
                curveToRelative(-0.337f, 0.166f, -0.538f, 0.314f, -0.64f, 0.42f)
                curveToRelative(0.047f, 0.05f, 0.13f, 0.128f, 0.28f, 0.224f)
                curveToRelative(0.384f, 0.248f, 1.007f, 0.508f, 1.864f, 0.742f)
                curveTo(6.894f, 20.7f, 9.302f, 21f, 12f, 21f)
                curveToRelative(2.699f, 0f, 5.106f, -0.3f, 6.808f, -0.764f)
                curveToRelative(0.857f, -0.234f, 1.48f, -0.494f, 1.864f, -0.742f)
                curveToRelative(0.15f, -0.096f, 0.232f, -0.174f, 0.28f, -0.224f)
                curveToRelative(-0.104f, -0.106f, -0.303f, -0.254f, -0.64f, -0.42f)
                curveToRelative(-0.676f, -0.333f, -1.71f, -0.644f, -3.033f, -0.88f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.81f, -1.158f)
            }
        }.build()

        return _SiPinAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SiPinAlt1: ImageVector? = null

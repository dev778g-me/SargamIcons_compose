package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiCopyright: ImageVector
    get() {
        if (_SiCopyright != null) {
            return _SiCopyright!!
        }
        _SiCopyright = ImageVector.Builder(
            name = "Filled.SiCopyright",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 12f)
                curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.477f, 2f, 12f)
                reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
                moveToRelative(-9.772f, -5f)
                curveTo(9.511f, 7f, 7.66f, 9.194f, 7.66f, 12f)
                reflectiveCurveToRelative(1.852f, 5f, 4.567f, 5f)
                curveToRelative(0.975f, 0f, 1.851f, -0.271f, 2.565f, -0.8f)
                curveToRelative(0.711f, -0.528f, 1.205f, -1.27f, 1.488f, -2.124f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.9f, -0.628f)
                curveToRelative(-0.17f, 0.52f, -0.444f, 0.896f, -0.78f, 1.145f)
                curveToRelative(-0.331f, 0.246f, -0.779f, 0.407f, -1.373f, 0.407f)
                curveToRelative(-1.414f, 0f, -2.567f, -1.092f, -2.567f, -3f)
                reflectiveCurveToRelative(1.153f, -3f, 2.567f, -3f)
                curveToRelative(0.594f, 0f, 1.042f, 0.161f, 1.374f, 0.407f)
                curveToRelative(0.335f, 0.249f, 0.608f, 0.626f, 0.78f, 1.145f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.899f, -0.628f)
                curveToRelative(-0.283f, -0.854f, -0.777f, -1.596f, -1.488f, -2.123f)
                curveToRelative(-0.714f, -0.53f, -1.59f, -0.801f, -2.565f, -0.801f)
            }
        }.build()

        return _SiCopyright!!
    }

@Suppress("ObjectPropertyName")
private var _SiCopyright: ImageVector? = null

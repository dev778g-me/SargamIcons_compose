package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiDollarAlt1: ImageVector
    get() {
        if (_SiDollarAlt1 != null) {
            return _SiDollarAlt1!!
        }
        _SiDollarAlt1 = ImageVector.Builder(
            name = "Filled.SiDollarAlt1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 13.52f)
                curveToRelative(0.24f, 0.136f, 0.415f, 0.265f, 0.544f, 0.39f)
                curveToRelative(0.252f, 0.244f, 0.376f, 0.513f, 0.408f, 0.97f)
                curveToRelative(0.033f, 0.468f, -0.16f, 0.848f, -0.536f, 1.158f)
                curveToRelative(-0.123f, 0.102f, -0.265f, 0.19f, -0.416f, 0.268f)
                close()
                moveTo(11f, 10.482f)
                arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.549f, -0.391f)
                curveToRelative(-0.25f, -0.243f, -0.374f, -0.512f, -0.406f, -0.97f)
                curveToRelative(-0.033f, -0.47f, 0.16f, -0.85f, 0.536f, -1.16f)
                quadToRelative(0.188f, -0.153f, 0.419f, -0.27f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.523f, 2f, 12f)
                reflectiveCurveTo(6.477f, 2f, 12f, 2f)
                moveToRelative(0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(0.556f)
                arcToRelative(4.6f, 4.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.691f, 0.862f)
                curveToRelative(-0.781f, 0.643f, -1.345f, 1.615f, -1.26f, 2.84f)
                curveToRelative(0.06f, 0.856f, 0.342f, 1.62f, 1.009f, 2.267f)
                curveToRelative(0.488f, 0.474f, 1.142f, 0.842f, 1.942f, 1.166f)
                verticalLineToRelative(3.89f)
                arcToRelative(3.9f, 3.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.354f, -0.481f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.012f, 1.724f)
                arcToRelative(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.366f, 0.77f)
                verticalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-0.559f)
                arcToRelative(4.6f, 4.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.688f, -0.859f)
                curveToRelative(0.78f, -0.643f, 1.345f, -1.616f, 1.26f, -2.842f)
                curveToRelative(-0.06f, -0.856f, -0.344f, -1.62f, -1.011f, -2.266f)
                curveToRelative(-0.488f, -0.473f, -1.14f, -0.84f, -1.937f, -1.164f)
                verticalLineTo(7.42f)
                curveToRelative(0.476f, 0.076f, 0.939f, 0.238f, 1.352f, 0.48f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.011f, -1.725f)
                arcTo(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 5.405f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
            }
        }.build()

        return _SiDollarAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SiDollarAlt1: ImageVector? = null

package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiCrosshairSimple: ImageVector
    get() {
        if (_SiCrosshairSimple != null) {
            return _SiCrosshairSimple!!
        }
        _SiCrosshairSimple = ImageVector.Builder(
            name = "Filled.SiCrosshairSimple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 12f)
                curveTo(1f, 5.925f, 5.925f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.925f, 11f, 11f)
                reflectiveCurveToRelative(-4.925f, 11f, -11f, 11f)
                reflectiveCurveTo(1f, 18.075f, 1f, 12f)
                moveTo(13f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                lineTo(11f, 2f)
                close()
                moveTo(2f, 11f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                lineTo(2f, 13f)
                close()
                moveTo(18f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(13f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
            }
        }.build()

        return _SiCrosshairSimple!!
    }

@Suppress("ObjectPropertyName")
private var _SiCrosshairSimple: ImageVector? = null

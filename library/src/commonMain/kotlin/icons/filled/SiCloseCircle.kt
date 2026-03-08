package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiCloseCircle: ImageVector
    get() {
        if (_SiCloseCircle != null) {
            return _SiCloseCircle!!
        }
        _SiCloseCircle = ImageVector.Builder(
            name = "Filled.SiCloseCircle",
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
                curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.523f, 2f, 12f)
                reflectiveCurveTo(6.477f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
                moveToRelative(-5.05f, -4.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.414f)
                lineTo(13.414f, 12f)
                lineToRelative(3.536f, 3.536f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, 1.414f)
                lineTo(12f, 13.414f)
                lineTo(8.464f, 16.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.414f, -1.414f)
                lineTo(10.586f, 12f)
                lineTo(7.05f, 8.464f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.464f, 7.05f)
                lineTo(12f, 10.586f)
                lineToRelative(3.536f, -3.536f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, 0f)
            }
        }.build()

        return _SiCloseCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SiCloseCircle: ImageVector? = null

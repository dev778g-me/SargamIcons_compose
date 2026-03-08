package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiSun: ImageVector
    get() {
        if (_SiSun != null) {
            return _SiSun!!
        }
        _SiSun = ImageVector.Builder(
            name = "Regular.SiSun",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    close()
                }
            ) {
                path(
                    stroke = SolidColor(Color.Black),
                    strokeLineWidth = 1.5f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(3f, 12f)
                    horizontalLineTo(1f)
                    moveToRelative(22f, 0f)
                    horizontalLineToRelative(-2f)
                    moveToRelative(-9f, 9f)
                    verticalLineToRelative(2f)
                    moveToRelative(0f, -22f)
                    verticalLineToRelative(2f)
                    moveTo(5.636f, 18.364f)
                    lineToRelative(-1.414f, 1.414f)
                    moveTo(19.778f, 4.222f)
                    lineToRelative(-1.414f, 1.414f)
                    moveToRelative(-12.728f, 0f)
                    lineTo(4.222f, 4.222f)
                    moveToRelative(15.556f, 15.556f)
                    lineToRelative(-1.414f, -1.414f)
                    moveTo(18f, 12f)
                    arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, 0f)
                    arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
                }
            }
        }.build()

        return _SiSun!!
    }

@Suppress("ObjectPropertyName")
private var _SiSun: ImageVector? = null

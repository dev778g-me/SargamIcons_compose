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

val Sargam.Regular.SiFlare: ImageVector
    get() {
        if (_SiFlare != null) {
            return _SiFlare!!
        }
        _SiFlare = ImageVector.Builder(
            name = "Regular.SiFlare",
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
                    moveTo(7f, 12f)
                    horizontalLineTo(1f)
                    moveToRelative(22f, 0f)
                    horizontalLineToRelative(-6f)
                    moveToRelative(-5f, 5f)
                    verticalLineToRelative(6f)
                    moveToRelative(3.536f, -7.464f)
                    lineToRelative(1.414f, 1.414f)
                    moveToRelative(-9.9f, -9.9f)
                    lineToRelative(1.414f, 1.414f)
                    moveToRelative(7.072f, 0f)
                    lineTo(16.95f, 7.05f)
                    moveToRelative(-9.9f, 9.9f)
                    lineToRelative(1.414f, -1.414f)
                    moveTo(12f, 1f)
                    verticalLineToRelative(6f)
                    moveToRelative(2f, 5f)
                    arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
                    arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                }
            }
        }.build()

        return _SiFlare!!
    }

@Suppress("ObjectPropertyName")
private var _SiFlare: ImageVector? = null

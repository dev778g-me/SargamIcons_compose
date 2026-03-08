package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiMicDetailed: ImageVector
    get() {
        if (_SiMicDetailed != null) {
            return _SiMicDetailed!!
        }
        _SiMicDetailed = ImageVector.Builder(
            name = "Regular.SiMicDetailed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 23f)
                horizontalLineToRelative(12f)
                moveToRelative(-6f, 0f)
                verticalLineToRelative(-4f)
                moveToRelative(0f, 0f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, -6f)
                verticalLineTo(7f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 7f)
                verticalLineToRelative(6f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6f)
                moveToRelative(0f, -9f)
                horizontalLineToRelative(0.1f)
                moveToRelative(2.9f, 0f)
                horizontalLineToRelative(0.1f)
                moveTo(9f, 10f)
                horizontalLineToRelative(0.1f)
                moveTo(12f, 7f)
                horizontalLineToRelative(0.1f)
                moveTo(15f, 7f)
                horizontalLineToRelative(0.1f)
                moveTo(9f, 7f)
                horizontalLineToRelative(0.1f)
                moveToRelative(2.9f, 6f)
                horizontalLineToRelative(0.1f)
                moveToRelative(-0.1f, 3f)
                horizontalLineToRelative(0.1f)
                moveTo(12f, 4f)
                horizontalLineToRelative(0.1f)
                moveToRelative(2.9f, 9f)
                horizontalLineToRelative(0.1f)
                moveTo(9f, 13f)
                horizontalLineToRelative(0.1f)
            }
        }.build()

        return _SiMicDetailed!!
    }

@Suppress("ObjectPropertyName")
private var _SiMicDetailed: ImageVector? = null

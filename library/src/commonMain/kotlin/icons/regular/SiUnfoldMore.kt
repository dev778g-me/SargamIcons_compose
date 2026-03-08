package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiUnfoldMore: ImageVector
    get() {
        if (_SiUnfoldMore != null) {
            return _SiUnfoldMore!!
        }
        _SiUnfoldMore = ImageVector.Builder(
            name = "Regular.SiUnfoldMore",
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
                moveToRelative(9f, 15f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                moveTo(9f, 9f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
        }.build()

        return _SiUnfoldMore!!
    }

@Suppress("ObjectPropertyName")
private var _SiUnfoldMore: ImageVector? = null

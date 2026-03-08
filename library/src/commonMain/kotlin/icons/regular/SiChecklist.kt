package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiChecklist: ImageVector
    get() {
        if (_SiChecklist != null) {
            return _SiChecklist!!
        }
        _SiChecklist = ImageVector.Builder(
            name = "Regular.SiChecklist",
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
                moveToRelative(2f, 8f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
                moveToRelative(4f, 2f)
                horizontalLineToRelative(10f)
                moveTo(2f, 16f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
                moveToRelative(4f, 2f)
                horizontalLineToRelative(10f)
            }
        }.build()

        return _SiChecklist!!
    }

@Suppress("ObjectPropertyName")
private var _SiChecklist: ImageVector? = null
